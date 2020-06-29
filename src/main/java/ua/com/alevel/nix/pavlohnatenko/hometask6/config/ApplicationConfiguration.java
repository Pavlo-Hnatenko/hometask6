package ua.com.alevel.nix.pavlohnatenko.hometask6.config;

public interface ApplicationConfiguration {

    <T> Class<? extends T> getCurrentImplementation(Class<T> type);
}
