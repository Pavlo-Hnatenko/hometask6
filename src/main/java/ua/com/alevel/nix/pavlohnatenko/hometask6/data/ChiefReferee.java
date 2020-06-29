package ua.com.alevel.nix.pavlohnatenko.hometask6.data;

import ua.com.alevel.nix.pavlohnatenko.hometask6.Report;
import ua.com.alevel.nix.pavlohnatenko.hometask6.SquadChecker;

public class ChiefReferee extends AbstractReferee {

    SquadChecker squadChecker = new SquadChecker();
    Report report = new Report();
    FourthReferee fourthReferee = new FourthReferee();
    AssistantReferee assistantReferee = new AssistantReferee();

    public void startMatch(Match match){
        squadChecker.checkSquads();
        enforceGameLaws(match);
        assistantReferee.flagFoul();
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
