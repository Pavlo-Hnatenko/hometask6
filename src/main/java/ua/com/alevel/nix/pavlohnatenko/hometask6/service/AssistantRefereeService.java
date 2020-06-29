package ua.com.alevel.nix.pavlohnatenko.hometask6.service;

import ua.com.alevel.nix.pavlohnatenko.hometask6.data.abstr.SportTeam;

public interface AssistantRefereeService<T extends SportTeam> {
    void flagFoul();
}
