package com.gameList.service;

import com.gameList.gamelist.model.Xbox;

public interface IXboxService {

	Xbox fetchById(int id);
	
	void save(Xbox xbox);
}
