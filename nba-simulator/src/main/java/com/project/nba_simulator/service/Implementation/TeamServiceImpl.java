package com.project.nba_simulator.service.Implementation;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.dto.TeamDto;
import com.project.nba_simulator.entity.Player;
import com.project.nba_simulator.entity.Team;
import com.project.nba_simulator.mapper.PlayerMapper;
import com.project.nba_simulator.mapper.TeamMapper;
import com.project.nba_simulator.repository.TeamRepository;
import com.project.nba_simulator.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;
    @Override
    public TeamDto createTeam(TeamDto teamDto) {
        Team team = TeamMapper.mapToTeam(teamDto);
        Team savedTeam = teamRepository.save(team);
        return TeamMapper.mapToTeamDto(savedTeam);
    }

    @Override
    public void addPlayer(TeamDto teamDto, PlayerDto playerDto) {
        Team team = TeamMapper.mapToTeam(teamDto);
        Player player = PlayerMapper.mapToPlayer(playerDto);
        team.getRoster().add(player);
        teamRepository.save(team);
        //player.getTeams().add(team);

    }
}
