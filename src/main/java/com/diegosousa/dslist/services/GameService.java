package com.diegosousa.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diegosousa.dslist.dto.GameMinDTO;
import com.diegosousa.dslist.entities.GameEntity;
import com.diegosousa.dslist.repositories.GameRepositoryInterface;

@Service
public class GameService {

	@Autowired
	private GameRepositoryInterface gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<GameEntity> gameEntityList = gameRepository.findAll();
		List<GameMinDTO> gameMinDTOList = gameEntityList.stream().map(gameEntity -> new GameMinDTO(gameEntity)).toList();
		return gameMinDTOList;
	}
}
