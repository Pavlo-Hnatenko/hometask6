package ua.com.alevel.nix.pavlohnatenko.hometask6;

public class SquadChecker {

    private boolean complyRules = true;

    public void checkSquads(){
        if(complyRules){
            System.out.println("squads are comply with the rules");
        } else {
            throw new SquadException("Squads don't comply with the rules");
        }
    }
}
