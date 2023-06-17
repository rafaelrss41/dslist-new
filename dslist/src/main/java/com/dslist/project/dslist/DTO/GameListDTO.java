package com.dslist.project.dslist.DTO;

import com.dslist.project.dslist.entities.Game;
import com.dslist.project.dslist.entities.GameList;

public class GameListDTO {

    private final Long id;
    private final String name;


    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
