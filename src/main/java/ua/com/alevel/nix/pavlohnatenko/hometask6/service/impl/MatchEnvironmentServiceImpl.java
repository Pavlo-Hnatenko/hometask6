package ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask6.annotation.Value;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.MatchEnvironmentService;

public class MatchEnvironmentServiceImpl implements MatchEnvironmentService {

    @Value
    private String weatherCondition;

    @Override
    public void check() {
        System.out.println("Th weather condition is " + weatherCondition);
    }
}
