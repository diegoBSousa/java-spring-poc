package com.diegosousa.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegosousa.dslist.entities.GameEntity;

public interface GameRepositoryInterface extends JpaRepository<GameEntity, Long>{

}
