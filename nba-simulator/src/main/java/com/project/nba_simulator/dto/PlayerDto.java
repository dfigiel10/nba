package com.project.nba_simulator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private int height;
    private int weight;
    private String position;
}