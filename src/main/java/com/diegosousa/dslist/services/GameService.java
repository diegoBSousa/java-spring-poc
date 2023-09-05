package com.diegosousa.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diegosousa.dslist.dto.GameDTO;
import com.diegosousa.dslist.dto.GameMinDTO;
import com.diegosousa.dslist.entities.GameEntity;
import com.diegosousa.dslist.repositories.GameRepositoryInterface;

@Service
public class GameService {

	@Autowired
	private GameRepositoryInterface gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<GameEntity> gameEntityList = gameRepository.findAll();
		List<GameMinDTO> gameMinDTOList = gameEntityList.stream().map(gameEntity -> new GameMinDTO(gameEntity)).toList();
		return gameMinDTOList;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long gameId) {
		GameEntity gameEntity = gameRepository.findById(gameId).get();
		return new GameDTO(gameEntity);
	}
}
