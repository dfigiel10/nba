package com.project.nba_simulator.mapper;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.entity.Player;

public class PlayerMapper {
    public static PlayerDto mapToPlayerDto(Player player) {
        return new PlayerDto(
                player.getId(),
                player.getFirstName(),
                player.getLastName(),
                player.getHeight(),
                player.getWeight(),
                player.getPosition()
        );
    }

    public static Player mapToPlayer(PlayerDto PlayerDto) {
        return new Player(
                PlayerDto.getId(),
                PlayerDto.getFirstName(),
                PlayerDto.getLastName(),
                PlayerDto.getHeight(),
                PlayerDto.getWeight(),
                PlayerDto.getPosition()
        );
    }
}