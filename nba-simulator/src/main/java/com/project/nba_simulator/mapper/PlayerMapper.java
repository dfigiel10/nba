package com.project.nba_simulator.mapper;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.entity.Player;
import com.project.nba_simulator.entity.Position;
import com.project.nba_simulator.entity.Team;
import com.project.nba_simulator.repository.PositionRepository;
import com.project.nba_simulator.repository.TeamRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayerMapper {
    public static PlayerDto mapToPlayerDto(Player player) {
        //List<Team> teams =
        return new PlayerDto(
                player.getId(),
                player.getFirstName(),
                player.getLastName(),
                player.getHeight(),
                player.getWeight(),
                player.getPositions().stream().map(Position::getId).collect(Collectors.toSet()),
                player.getTeams().stream().map(Team::getId).collect(Collectors.toList())
        );
    }

    public static Player mapToPlayer(PlayerDto PlayerDto, PositionRepository positionRepository, TeamRepository teamRepository) {
        // Set<Optional<Position>> positions;
//        for (Long id : PlayerDto.getPositions()) {
//            positions.add(positionRepository.findById(id));
//        }

        Set<Position> positions = PlayerDto.getPositions().stream()
                .map(positionRepository::findById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());

        List<Team> teams = PlayerDto.getTeams().stream()
                .map(teamRepository::findById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();

        return new Player(
                PlayerDto.getId(),
                PlayerDto.getFirstName(),
                PlayerDto.getLastName(),
                PlayerDto.getHeight(),
                PlayerDto.getWeight(),
                positions,
                //PlayerDto.getTeams().stream().map(Long::)
                teams
        );
    }
}