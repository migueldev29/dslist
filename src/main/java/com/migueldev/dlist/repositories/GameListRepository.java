package com.migueldev.dlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migueldev.dlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
