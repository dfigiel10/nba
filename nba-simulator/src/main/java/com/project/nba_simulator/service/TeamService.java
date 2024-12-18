package com.project.nba_simulator.service;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.dto.TeamDto;

public interface TeamService {

    TeamDto createTeam(TeamDto teamDto);
    void addPlayer(TeamDto teamDto, PlayerDto playerDto);
}
