package com.project.nba_simulator.controller;


import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private PlayerService playerService;


    @PostMapping
    public ResponseEntity<PlayerDto> createPlayer(@RequestBody PlayerDto playerDto) {
        PlayerDto savedPlayer = playerService.createPlayer(playerDto);
        return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
    }
}


