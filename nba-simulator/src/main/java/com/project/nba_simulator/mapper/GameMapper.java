package com.project.nba_simulator.mapper;

import com.project.nba_simulator.dto.GameDto;
import com.project.nba_simulator.entity.Game;
import com.project.nba_simulator.entity.Team;
import com.project.nba_simulator.repository.TeamRepository;

public class GameMapper {

    public static GameDto mapToGameDto(Game game) {
        return new GameDto(
                game.getId(),
                game.getHomeTeam().getId(),
                game.getAwayTeam().getId(),
                game.getHomeTeamScore(),
                game.getAwayTeamScore(),
                game.getWinner().getId()
        );
    }

    public static Game mapToGame(GameDto gameDto, TeamRepository teamRepository) {

        Team homeTeam = teamRepository.findById(gameDto.getHomeTeam())
                .orElseThrow(() -> new RuntimeException("Home team not found"));
        Team awayTeam = teamRepository.findById(gameDto.getAwayTeam())
                .orElseThrow(() -> new RuntimeException("Away team not found"));
        Team winningTeam = teamRepository.findById(gameDto.getWinner())
                .orElseThrow(() -> new RuntimeException("Team not found"));

        return new Game(
                gameDto.getId(),
                homeTeam,
                awayTeam,
                gameDto.getHomeTeamScore(),
                gameDto.getAwayTeamScore(),
                winningTeam
        );
    }
}
