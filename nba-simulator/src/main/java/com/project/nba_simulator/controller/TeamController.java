package com.project.nba_simulator.controller;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.dto.TeamDto;
import com.project.nba_simulator.entity.Player;
import com.project.nba_simulator.mapper.TeamMapper;
import com.project.nba_simulator.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/team")
public class TeamController {

    private TeamService teamService;
    @PostMapping("/createTeam")
    public ResponseEntity<TeamDto> createTeam(@RequestBody TeamDto teamDto) {
        TeamDto savedTeam = teamService.createTeam(teamDto);
        return new ResponseEntity<>(savedTeam, HttpStatus.CREATED);
    }

    @PutMapping("/addPlayer")
    public ResponseEntity<HttpStatus> addPlayer(@RequestParam Long teamId, @RequestParam Long playerId) {
//        Long teamId = ids.get("teamId");
//        Long playerId = ids.get("playerId");
        teamService.addPlayer(teamId, playerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getRoster")
    public ResponseEntity<List<Player>> getRoster(@RequestParam Long teamId) {
        List<Player> roster = teamService.getRoster(teamId);
        return new ResponseEntity<>(roster, HttpStatus.OK);
    }
}
