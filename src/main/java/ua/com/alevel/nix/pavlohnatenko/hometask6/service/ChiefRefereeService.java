package ua.com.alevel.nix.pavlohnatenko.hometask6.service;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.abstr.Match;

public interface ChiefRefereeService<M extends Match> {
    void startMatch(M m);
}
