package com.project.nba_simulator.mapper;

import com.project.nba_simulator.dto.PositionDto;
import com.project.nba_simulator.entity.Player;
import com.project.nba_simulator.entity.Position;
import com.project.nba_simulator.repository.PlayerRepository;
import java.util.*;
import java.util.stream.Collectors;

public class PositionMapper {
    public static PositionDto mapToPositionDto(Position position) {
        return new PositionDto(
                position.getId(),
                position.getPosition(),
                position.getPlayers().stream().map(Player::getId).collect(Collectors.toSet())
        );
    }

    public static Position mapToPosition(PositionDto positionDto, PlayerRepository playerRepository) {
        Set<Player> players = positionDto.getPlayers().stream()
                .map(playerRepository::findById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());
        return new Position (
                positionDto.getId(),
                positionDto.getPosition(),
                players
                //positionDto.getPlayers()
        );
    }
}
