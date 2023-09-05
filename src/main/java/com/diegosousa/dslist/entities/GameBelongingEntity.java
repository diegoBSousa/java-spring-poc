package com.diegosousa.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class GameBelongingEntity {
	
	@EmbeddedId
	private GameBelongingPkEntity id = new GameBelongingPkEntity();
	private Integer position;
	
	public GameBelongingEntity(){}

	public GameBelongingEntity(GameEntity game, GameListEntity gameList, Integer position) {
		this.id.setGame(game);
		this.id.setList(gameList);
		this.position = position;
	}

	public GameBelongingPkEntity getId() {
		return id;
	}

	public void setId(GameBelongingPkEntity id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameBelongingEntity other = (GameBelongingEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
