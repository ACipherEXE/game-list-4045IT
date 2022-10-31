package com.gameList.service;

import com.gameList.gamelist.model.Nintendo;

public interface INintendoService {

	Nintendo fetchById(int id);
	
	void save(Nintendo nintendo);
}
