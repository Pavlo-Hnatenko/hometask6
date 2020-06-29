package ua.com.alevel.nix.pavlohnatenko.hometask6;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.Match;

public class Referee {

    SquadChecker squadChecker = new SquadChecker();
    Report report = new Report();
    FourthReferee fourthReferee = new FourthReferee();
    Linesman linesman = new Linesman();

    public void startMatch(Match match){
        squadChecker.checkSquads();
        enforceGameLaws(match);
        linesman.flagFoul();
        fourthReferee.allowReplacement();
        report.provideReport();
    }

    public void enforceGameLaws(Match match){
        System.out.println("give a first time starting whistle");
        System.out.println("fixing foul");
        System.out.println("give a break whistle");
        System.out.println("give a second time starting whistle");
        System.out.println("give a final whistle");
    }
}
