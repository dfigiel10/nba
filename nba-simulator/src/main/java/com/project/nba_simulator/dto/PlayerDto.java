package com.project.nba_simulator.dto;

import com.project.nba_simulator.entity.Position;
import com.project.nba_simulator.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private int height;
    private int weight;
    private Set<Position> positions;
    private List<Team> teams;
    //private String hand;
}