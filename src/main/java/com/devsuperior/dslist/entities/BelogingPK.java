package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable /* Encapsulando 2 atributos em uma classe só */
public class BelogingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gamelist;

    public BelogingPK() {
    }

    public BelogingPK(Game game, GameList gamelist) {
        this.game = game;
        this.gamelist = gamelist;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGamelist() {
        return gamelist;
    }

    public void setGamelist(GameList gamelist) {
        this.gamelist = gamelist;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((game == null) ? 0 : game.hashCode());
        result = prime * result + ((gamelist == null) ? 0 : gamelist.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelogingPK other = (BelogingPK) obj;
        if (game == null) {
            if (other.game != null)
                return false;
        } else if (!game.equals(other.game))
            return false;
        if (gamelist == null) {
            if (other.gamelist != null)
                return false;
        } else if (!gamelist.equals(other.gamelist))
            return false;
        return true;
    }

}
