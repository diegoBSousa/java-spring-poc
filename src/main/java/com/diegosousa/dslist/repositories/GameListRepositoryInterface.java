package com.diegosousa.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegosousa.dslist.entities.GameListEntity;

public interface GameListRepositoryInterface extends JpaRepository<GameListEntity, Long>{

}
