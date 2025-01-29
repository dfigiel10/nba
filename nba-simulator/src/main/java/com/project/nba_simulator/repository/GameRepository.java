package com.project.nba_simulator.repository;

import com.project.nba_simulator.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
