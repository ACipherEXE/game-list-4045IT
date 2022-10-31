package com.gameList.service;

import com.gameList.gamelist.model.PC;

public interface IPCService {

	PC fetchById(int id);
	
	void save(PC pc);
}
