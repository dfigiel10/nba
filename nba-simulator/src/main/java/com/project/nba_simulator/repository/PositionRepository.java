package com.project.nba_simulator.repository;

import com.project.nba_simulator.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
