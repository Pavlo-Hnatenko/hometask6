package ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.FootbalTeam;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.AssistantRefereeService;

public class AssistantRefereeServiceImpl implements AssistantRefereeService<FootbalTeam> {
    @Override
    public void flagFoul(){
        System.out.println("offside is flagged");
    }
}
