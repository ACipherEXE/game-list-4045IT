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
		// TODO Auto-generated method stub
		return gameListRepository.findAll();
	}
	public List<GameList> findNintendo() {
		// TODO Auto-generated method stub
		return gameListRepository.findAll();
	}
	public List<GameList> findPC() {
		// TODO Auto-generated method stub
		return gameListRepository.findAll();
	}
	public List<GameList> findXbox() {
		// TODO Auto-generated method stub
		return gameListRepository.findAll();
	}
	public List<GameList> findPlaystation() {
		// TODO Auto-generated method stub
		return gameListRepository.findAll();
	}

	@Override
	public GameList findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

}
