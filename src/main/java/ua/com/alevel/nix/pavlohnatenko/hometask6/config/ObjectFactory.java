package ua.com.alevel.nix.pavlohnatenko.hometask6.config;

import ua.com.alevel.nix.pavlohnatenko.hometask6.annotation.Value;
import ua.com.alevel.nix.pavlohnatenko.hometask6.config.impl.JavaApplicationConfiguration;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.SquadCheckerService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl.SquadQuotaCheckerServiceImpl;
import ua.com.alevel.nix.pavlohnatenko.hometask6.util.ResourceUtil;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {

    private static ObjectFactory instance;
    private ApplicationConfiguration config;

    private ObjectFactory() {
        config = new JavaApplicationConfiguration(
                "ua.com.alevel.nix.pavlohnatenko.hometask6",
                new HashMap<>(Map.of(SquadCheckerService.class, SquadQuotaCheckerServiceImpl.class)));
    }

    public static ObjectFactory getInstance() {
        if (instance == null) {
            instance = new ObjectFactory();
        }
        return instance;
    }

    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getCurrentImplementation(type);
        }
        T t;
        try {
            t = implClass.getDeclaredConstructor().newInstance();
            initFields(implClass, t);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("невозможно создать класс: " + e.getClass().getName() + " " + ",msg: " + e.getMessage());
        }
        return t;
    }

    private <T> void initFields(Class<? extends T> implClass, T t) {
        Map<String, String> map = ResourceUtil.getResource("application.properties");
        for (Field field : implClass.getDeclaredFields()) {
            Value annotation = field.getAnnotation(Value.class);
            if (annotation != null) {
                String value = annotation.value().isEmpty() ? map.get(field.getName()) : annotation.value();
                field.setAccessible(true);
                try {
                    field.set(t, value);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Возникли проблемы с инициализацией филда: " + e.getMessage());
                }
            }
        }
    }
}
