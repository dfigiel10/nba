package com.project.nba_simulator.service.Implementation;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.dto.TeamDto;
import com.project.nba_simulator.entity.Player;
import com.project.nba_simulator.entity.Team;
import com.project.nba_simulator.mapper.PlayerMapper;
import com.project.nba_simulator.mapper.TeamMapper;
import com.project.nba_simulator.repository.PlayerRepository;
import com.project.nba_simulator.repository.TeamRepository;
import com.project.nba_simulator.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;
    private PlayerRepository playerRepository;

    @Override
    public TeamDto createTeam(TeamDto teamDto) {
        Team team = TeamMapper.mapToTeam(teamDto, playerRepository);
        Team savedTeam = teamRepository.save(team);
        return TeamMapper.mapToTeamDto(savedTeam);
    }

    @Override
    public void addPlayer(Long teamId, Long playerId) {
        System.out.println("adding player to team...");
        Team team = teamRepository.findById(teamId)
                .orElseThrow(() -> new RuntimeException("Team not found"));

        Player player = playerRepository.findById(playerId)
                .orElseThrow(() -> new RuntimeException("Player not found"));

        team.getRoster().add(player);
        player.getTeams().add(team);
        System.out.println(team.getName());

        for (Player p : team.getRoster()) {
            System.out.println(p.getFirstName());
        }
        teamRepository.save(team);
        //player.getTeams().add(team);

    }

    @Override
    public Set<Player> getRoster(Long teamId) {
        Team team = teamRepository.findById(teamId)
                .orElseThrow(() -> new RuntimeException("Team not found"));
        return team.getRoster();
    }

    @Override
    public void draftPlayer(Long teamId, Long playerId) {
        addPlayer(teamId, playerId);
    }
}
