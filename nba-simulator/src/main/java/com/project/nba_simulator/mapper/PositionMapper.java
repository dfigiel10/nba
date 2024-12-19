package com.project.nba_simulator.mapper;

import com.project.nba_simulator.dto.PositionDto;
import com.project.nba_simulator.entity.Position;

public class PositionMapper {
    public static PositionDto mapToPositionDto(Position position) {
        return new PositionDto(
                position.getId(),
                position.getPosition(),
                position.getPlayers()
        );
    }

    public static Position mapToPosition(PositionDto positionDto) {
        return new Position (
                positionDto.getId(),
                positionDto.getPosition(),
                positionDto.getPlayers()
        );
    }
}
