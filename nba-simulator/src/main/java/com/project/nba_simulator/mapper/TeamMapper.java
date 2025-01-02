package com.project.nba_simulator.mapper;

import com.project.nba_simulator.dto.TeamDto;
import com.project.nba_simulator.entity.Player;
import com.project.nba_simulator.entity.Team;
import com.project.nba_simulator.repository.PlayerRepository;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TeamMapper {
    public static TeamDto mapToTeamDto(Team team) {
        return new TeamDto(
                team.getId(),
                team.getName(),
                team.getRoster().stream().map(Player::getId).collect(Collectors.toSet())
        );
    }

    public static Team mapToTeam(TeamDto teamDto, PlayerRepository playerRepository) {
        Set<Player> roster = teamDto.getRoster().stream()
                .map(playerRepository::findById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());
        return new Team(
                teamDto.getId(),
                teamDto.getName(),
                roster
                //teamDto.getRoster()
        );
    }
}

