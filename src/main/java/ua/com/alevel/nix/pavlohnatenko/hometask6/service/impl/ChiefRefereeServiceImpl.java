package ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl;

import ua.com.alevel.nix.pavlohnatenko.hometask6.config.ObjectFactory;
import ua.com.alevel.nix.pavlohnatenko.hometask6.data.FootballMatch;
import ua.com.alevel.nix.pavlohnatenko.hometask6.data.abstr.Match;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.AssistantRefereeService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.ChiefRefereeService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.ReportService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.SquadCheckerService;

public class ChiefRefereeServiceImpl implements ChiefRefereeService<FootballMatch> {
    SquadCheckerService squadCheckerService = ObjectFactory.getInstance().createObject(SquadCheckerService.class);
    ReportService reportService = ObjectFactory.getInstance().createObject(ReportService.class);
    AssistantRefereeService assistantRefereeService = ObjectFactory.getInstance().createObject(AssistantRefereeService.class);

    @Override
    public void startMatch(FootballMatch footballMatch) {

        squadCheckerService.isCorrespond();
        assistantRefereeService.flagFoul();
        enforceGameLaws(footballMatch);
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
