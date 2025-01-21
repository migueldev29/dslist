package com.migueldev.dlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migueldev.dlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
