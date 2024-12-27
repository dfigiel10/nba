package com.project.nba_simulator.service;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.dto.PositionDto;
import com.project.nba_simulator.entity.Player;

import java.util.List;

public interface PositionService {
    List<Player> getPlayers(Long positionId);
    PositionDto createPosition(PositionDto positionDto);
}
