package com.superior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superior.dsmovie.entities.Score;
import com.superior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}