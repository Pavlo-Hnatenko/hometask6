package ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.FootballMatch;
import ua.com.alevel.nix.pavlohnatenko.hometask6.data.abstr.Match;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.AssistantRefereeService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.ChiefRefereeService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.ReportService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.SquadCheckerService;

public class ChiefRefereeServiceImpl implements ChiefRefereeService<FootballMatch> {
    SquadCheckerService squadCheckerService = new SquadCheckerServiceImpl();
    ReportService reportService = new ReportServiceImpl();
    AssistantRefereeService<FootballMatch> assistantRefereeService = new AssistantRefereeServiceImpl();

    @Override
    public void startMatch(FootballMatch footballMatch) {
        squadCheckerService.isCorrespond();
        enforceGameLaws(footballMatch);
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
