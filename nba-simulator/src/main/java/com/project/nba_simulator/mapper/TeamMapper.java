package com.project.nba_simulator.mapper;

import com.project.nba_simulator.dto.TeamDto;
import com.project.nba_simulator.entity.Team;

public class TeamMapper {
    public static TeamDto mapToTeamDto(Team team) {
        return new TeamDto(
                team.getId(),
                team.getName(),
                team.getRoster()
        );
    }

    public static Team mapToTeam(TeamDto teamDto) {
        return new Team(
                teamDto.getId(),
                teamDto.getName(),
                teamDto.getRoster()
        );
    }
}

