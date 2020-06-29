package ua.com.alevel.nix.pavlohnatenko.hometask6.service;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.Match;

public class ChiefRefereeService {
    SquadCheckerService squadCheckerService = new SquadCheckerService();
    ReportService reportService = new ReportService();
    FourthRefereeService fourthRefereeService = new FourthRefereeService();
    AssistantRefereeService assistantRefereeService = new AssistantRefereeService();

    public void startMatch(Match match){
        squadCheckerService.checkSquads();
        enforceGameLaws(match);
        assistantRefereeService.flagFoul();
        fourthRefereeService.allowReplacement();
        reportService.provideReport();
    }

    public void enforceGameLaws(Match match){
        System.out.println("give a first time starting whistle");
        System.out.println("fixing foul");
        System.out.println("give a break whistle");
        System.out.println("give a second time starting whistle");
        System.out.println("give a final whistle");
    }
}
