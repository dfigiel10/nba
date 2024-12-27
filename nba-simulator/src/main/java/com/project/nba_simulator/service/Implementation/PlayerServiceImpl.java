package com.project.nba_simulator.service.Implementation;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.dto.PositionDto;
import com.project.nba_simulator.entity.Player;
import com.project.nba_simulator.entity.Position;
import com.project.nba_simulator.mapper.PlayerMapper;
import com.project.nba_simulator.repository.PlayerRepository;
import com.project.nba_simulator.service.PlayerService;
import com.project.nba_simulator.service.PositionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PositionServiceImpl positionService;

    @Override
    public PlayerDto createPlayer(PlayerDto playerDto) {
        Player player = PlayerMapper.mapToPlayer(playerDto);
        Player savedPlayer = playerRepository.save(player);
        return PlayerMapper.mapToPlayerDto(savedPlayer);
    }

    @Override
    public PlayerDto editPlayerPosition(Long playerId, Long positionId) {
        Player player = playerRepository.findById(playerId)
                .orElseThrow(() -> new RuntimeException("player not found"));
        Position position = positionService.getPosition(positionId);
        player.getPositions().add(position);
        playerRepository.save(player);
        return PlayerMapper.mapToPlayerDto(player);
    }
}
