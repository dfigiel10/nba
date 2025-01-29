package com.project.nba_simulator.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameDto {
    private Long id;
    private Long homeTeam;
    private Long awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    private Long winner; // winning team
}
