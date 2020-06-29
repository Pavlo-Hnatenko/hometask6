package ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask6.exception.SquadException;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.SquadCheckerService;

public class SquadCheckerServiceImpl implements SquadCheckerService {
    private boolean correspondRules = true;

    @Override
    public void isCorrespond(){
        if(correspondRules){
            System.out.println("squads are comply with the rules");
        } else {
            throw new SquadException("Squads don't comply with the rules");
        }
    }
}
