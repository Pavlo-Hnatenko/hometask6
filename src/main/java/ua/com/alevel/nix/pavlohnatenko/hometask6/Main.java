package ua.com.alevel.nix.pavlohnatenko.hometask6;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.FootballMatch;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.ChiefRefereeService;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl.ChiefRefereeServiceImpl;

public class Main {
    public static void main(String[] args) {
        ChiefRefereeService<FootballMatch> chiefRefereeService = new ChiefRefereeServiceImpl();
        chiefRefereeService.startMatch(new FootballMatch());
    }
}
