package com.project.nba_simulator.service;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.dto.PositionDto;

import java.util.List;

public interface PositionService {
    List<PlayerDto> getPlayers(Long positionId);
    PositionDto createPosition(PositionDto positionDto);
}
