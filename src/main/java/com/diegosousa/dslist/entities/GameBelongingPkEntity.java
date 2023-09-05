package com.diegosousa.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class GameBelongingPkEntity {
	
	@ManyToOne
	@JoinColumn(name= "game_id")
	private GameEntity game;
	
	@ManyToOne
	@JoinColumn(name= "list_id")
	private GameListEntity list;
	
	public GameBelongingPkEntity() {}

	public GameBelongingPkEntity(GameEntity game, GameListEntity list) {
		super();
		this.game = game;
		this.list = list;
	}

	public GameEntity getGame() {
		return game;
	}

	public void setGame(GameEntity game) {
		this.game = game;
	}

	public GameListEntity getList() {
		return list;
	}

	public void setList(GameListEntity list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameBelongingPkEntity other = (GameBelongingPkEntity) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}
	
	

}
