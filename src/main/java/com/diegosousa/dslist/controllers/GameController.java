package com.diegosousa.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegosousa.dslist.dto.GameDTO;
import com.diegosousa.dslist.dto.GameMinDTO;
import com.diegosousa.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> gameMinDTOList = gameService.findAll(); // Modify service signature
		return gameMinDTOList;
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO gameDTO = gameService.findById(id);
		return gameDTO;
	}
}
