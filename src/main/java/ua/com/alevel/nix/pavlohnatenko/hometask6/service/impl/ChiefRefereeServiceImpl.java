package ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.FootbalTeam;
import ua.com.alevel.nix.pavlohnatenko.hometask6.data.Match;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.AssistantRefereeService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.ReportService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.SquadCheckerService;

public class ChiefRefereeServiceImpl {
    SquadCheckerService squadCheckerService = new SquadCheckerServiceImpl();
    ReportService reportService = new ReportServiceImpl();
    AssistantRefereeService<FootbalTeam> assistantRefereeService = new AssistantRefereeServiceImpl();

    public void startMatch(Match match){
        squadCheckerService.isCorrespond();
        enforceGameLaws(match);
        assistantRefereeService.flagFoul();
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
