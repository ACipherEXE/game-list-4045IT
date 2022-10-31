package com.gameList.service;

import com.gameList.gamelist.model.Platform;

public interface IPlatformService {

	Platform fetchById(int id);
	
	void save(Platform platform);
}
