package com.superior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}