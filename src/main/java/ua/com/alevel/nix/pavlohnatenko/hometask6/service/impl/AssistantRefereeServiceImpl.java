package ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.FootballMatch;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.AssistantRefereeService;

public class AssistantRefereeServiceImpl implements AssistantRefereeService<FootballMatch> {
    @Override
    public void flagFoul(){
        System.out.println("offside is flagged");
    }
}
