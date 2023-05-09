package com.andremultifocal.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andremultifocal.dslist.Entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
