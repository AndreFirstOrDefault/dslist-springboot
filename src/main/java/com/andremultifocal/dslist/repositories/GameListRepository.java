package com.andremultifocal.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andremultifocal.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}
