package com.diegosousa.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diegosousa.dslist.dto.GameListDTO;
import com.diegosousa.dslist.entities.GameListEntity;
import com.diegosousa.dslist.repositories.GameListRepositoryInterface;

@Service
public class GameListService {

	@Autowired
	private GameListRepositoryInterface gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameListEntity> gameListEntityList = gameListRepository.findAll();
		List<GameListDTO> gameListDTOList = gameListEntityList.stream().map(gameListEntity -> new GameListDTO(gameListEntity)).toList();
		return gameListDTOList;
	}
}
