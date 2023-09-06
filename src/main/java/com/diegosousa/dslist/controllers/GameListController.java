package com.diegosousa.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegosousa.dslist.dto.GameListDTO;
import com.diegosousa.dslist.dto.GameMinDTO;
import com.diegosousa.dslist.services.GameListService;
import com.diegosousa.dslist.services.GameService;

@RestController
@RequestMapping(value = "/game-list")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> gameListDTOList = gameListService.findAll();
		return gameListDTOList;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		List<GameMinDTO> gameMinDTOList = gameService.findByList(listId);
		return gameMinDTOList;
	}
}