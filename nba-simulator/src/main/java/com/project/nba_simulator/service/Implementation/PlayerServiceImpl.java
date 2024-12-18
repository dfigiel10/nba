package com.project.nba_simulator.service.Implementation;

import com.project.nba_simulator.dto.PlayerDto;
import com.project.nba_simulator.entity.Player;
import com.project.nba_simulator.mapper.PlayerMapper;
import com.project.nba_simulator.repository.PlayerRepository;
import com.project.nba_simulator.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;

    @Override
    public PlayerDto createPlayer(PlayerDto playerDto) {
        Player player = PlayerMapper.mapToPlayer(playerDto);
        Player savedPlayer = playerRepository.save(player);
        return PlayerMapper.mapToPlayerDto(savedPlayer);
    }
}
