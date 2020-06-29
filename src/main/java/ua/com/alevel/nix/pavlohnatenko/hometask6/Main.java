package ua.com.alevel.nix.pavlohnatenko.hometask6;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.Match;
import ua.com.alevel.nix.pavlohnatenko.hometask6.service.impl.ChiefRefereeServiceImpl;

public class Main {
    public static void main(String[] args) {
        ChiefRefereeServiceImpl chiefRefereeServiceImpl = new ChiefRefereeServiceImpl();
        chiefRefereeServiceImpl.startMatch(new Match());
    }
}
