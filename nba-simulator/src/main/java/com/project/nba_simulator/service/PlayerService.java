package com.project.nba_simulator.service;

import com.project.nba_simulator.dto.PlayerDto;


public interface PlayerService {

    PlayerDto createPlayer(PlayerDto playerDto);
    PlayerDto editPlayerPosition(Long playerId, Long positionId);
}
