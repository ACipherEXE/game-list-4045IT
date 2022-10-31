package com.gameList.service;

import com.gameList.gamelist.model.Playstation;

public interface IPlaystationService {

	Playstation fetchById(int id);
	
	void save(Playstation playstation);
}
