package ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask6.config.ObjectFactory;
import ua.com.alevel.nix.pavlohnatenko.hometask6.data.FootballMatch;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.AssistantRefereeService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.MatchEnvironmentService;

public class AssistantRefereeServiceImpl implements AssistantRefereeService<FootballMatch> {

    private MatchEnvironmentService matchEnvironmentService = ObjectFactory.getInstance().createObject(MatchEnvironmentService.class);

    @Override
    public void flagFoul(){
        matchEnvironmentService.check();
        System.out.println("offside is flagged");
    }
}
