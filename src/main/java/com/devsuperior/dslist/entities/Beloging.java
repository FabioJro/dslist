package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_beloging")
public class Beloging {

    @EmbeddedId
    private BelogingPK id = new BelogingPK();

    private Integer position;

    public Beloging() {
    }

    public Beloging(Game game, GameList list,Integer position) {
        id.setGame(game);
        id.setGamelist(list);
        this.position = position;
    }

    public BelogingPK getId() {
        return id;
    }

    public void setId(BelogingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    
}
