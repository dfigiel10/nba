package com.project.nba_simulator.controller;

import com.project.nba_simulator.dto.PositionDto;
import com.project.nba_simulator.service.PositionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/position")
public class PositionController {

    private PositionService positionService;
    @PostMapping
    public ResponseEntity<PositionDto> createPosition(@RequestBody PositionDto positionDto) {
        PositionDto savedPosition = positionService.createPosition(positionDto);
        return new ResponseEntity<>(savedPosition, HttpStatus.CREATED);
    }
}
