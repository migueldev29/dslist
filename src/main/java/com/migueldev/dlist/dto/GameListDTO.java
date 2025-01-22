package com.migueldev.dlist.dto;

import com.migueldev.dlist.entities.GameList;

public class GameListDTO {
    
    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}
