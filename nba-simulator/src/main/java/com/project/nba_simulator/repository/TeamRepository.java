package com.project.nba_simulator.repository;

import com.project.nba_simulator.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
