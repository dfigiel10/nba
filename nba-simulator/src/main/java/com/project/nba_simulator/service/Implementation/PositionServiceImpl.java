package com.project.nba_simulator.service.Implementation;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.dto.PositionDto;
import com.project.nba_simulator.entity.Position;
import com.project.nba_simulator.mapper.PositionMapper;
import com.project.nba_simulator.repository.PositionRepository;

import java.util.List;

public class PositionServiceImpl {
    private PositionRepository positionRepository;

    public List<PlayerDto> getPlayers(Long positionId) {
        Position position = positionRepository.findById(positionId)
                .orElseThrow(() -> new RuntimeException("Position not found"));
        return position.getPlayers();
    }

    public PositionDto createPosition(PositionDto positionDto) {
        Position position = PositionMapper.mapToPosition(positionDto);
        Position savedPosition = positionRepository.save(position);
        return PositionMapper.mapToPositionDto(savedPosition);
    }
}
