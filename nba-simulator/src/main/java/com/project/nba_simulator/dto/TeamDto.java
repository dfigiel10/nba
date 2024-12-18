package com.project.nba_simulator.dto;

import com.project.nba_simulator.entity.Player;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {
    private Long id;
    private String name;
    private List<Player> roster;
}
