package com.project.nba_simulator.dto;

import com.project.nba_simulator.entity.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PositionDto {
    private Long id;
    private String position;
    private Set<Player> players;
}
