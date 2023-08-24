package com.diegosousa.dslist.dto;

import com.diegosousa.dslist.entities.GameEntity;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {}

	public GameMinDTO(GameEntity gameEntity) {
		super();
		id = gameEntity.getId();
		title = gameEntity.getTitle();
		year = gameEntity.getYear();
		imgUrl = gameEntity.getImgUrl();
		shortDescription = gameEntity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
