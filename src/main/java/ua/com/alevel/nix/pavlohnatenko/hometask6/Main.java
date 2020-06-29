package ua.com.alevel.nix.pavlohnatenko.hometask6;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.Match;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.ChiefRefereeService;

public class Main {
    public static void main(String[] args) {
        ChiefRefereeService chiefRefereeService = new ChiefRefereeService();
        chiefRefereeService.startMatch(new Match());
    }
}
