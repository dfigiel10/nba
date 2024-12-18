package com.project.nba_simulator.service;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.dto.TeamDto;
import com.project.nba_simulator.entity.Player;

import java.util.List;

public interface TeamService {

    TeamDto createTeam(TeamDto teamDto);
    void addPlayer(Long teamId, Long playerId);
    List<Player> getRoster(Long teamId);
    void draftPlayer(Long teamId, Long playerId);
}
