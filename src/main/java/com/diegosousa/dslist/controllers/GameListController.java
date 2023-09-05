package com.diegosousa.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegosousa.dslist.dto.GameListDTO;
import com.diegosousa.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/game-list")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> gameListDTOList = gameListService.findAll();
		return gameListDTOList;
	}
}
