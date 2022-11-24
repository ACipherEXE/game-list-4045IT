package com.gameList.gamelist.service;
import java.util.List;

import com.gameList.gamelist.entity.GameList;



public interface GameListService {
	public List<GameList> findAll();
	public GameList findById(int theId);
	public void deletebyId (int theId);
	public void save(GameList theGamelist);
	

	
}
