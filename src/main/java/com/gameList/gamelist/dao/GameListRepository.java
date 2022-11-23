package com.gameList.gamelist.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gameList.gamelist.entity.GameList;
public interface GameListRepository extends JpaRepository<GameList, Integer>{
	public List<GameList> findAllByOrderByGameName();

}
