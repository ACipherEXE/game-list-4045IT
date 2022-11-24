package com.gameList.gamelist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gameList.gamelist.dao.GameListRepository;
import com.gameList.gamelist.entity.GameList;
@Service
public class GameListServiceImpl implements GameListService{
	
	private GameListRepository gameListRepository;
	@Autowired
	public GameListServiceImpl(GameListRepository theGameListRepository) {
		gameListRepository = theGameListRepository;
	}

	@Override
	public List<GameList> findAll() {
		return gameListRepository.findAll();
	}
	public List<GameList> findNintendo() {
		return gameListRepository.findAll();
	}
	public List<GameList> findPC() {
		return gameListRepository.findAll();
	}
	public List<GameList> findXbox() {
		return gameListRepository.findAll();
	}
	public List<GameList> findPlaystation() {
		return gameListRepository.findAll();
	}

	@Override
	public GameList findById(int theId) {
		return null;
	}
	
	public GameList getConsole(String console) {
		return null;
	}


}
