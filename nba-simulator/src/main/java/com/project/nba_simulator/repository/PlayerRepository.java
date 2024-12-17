package com.project.nba_simulator.repository;

import com.project.nba_simulator.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
