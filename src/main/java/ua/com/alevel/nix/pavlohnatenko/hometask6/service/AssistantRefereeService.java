package ua.com.alevel.nix.pavlohnatenko.hometask6.service;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.abstr.Match;

public interface AssistantRefereeService<M extends Match> {
    void flagFoul();
}
