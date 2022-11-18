package com.gameList.gamelist;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gameList.gamelist.entity.GameList;
import com.gameList.gamelist.model.Nintendo;
import com.gameList.gamelist.model.PC;
import com.gameList.gamelist.model.Playstation;
import com.gameList.gamelist.model.Platform;
import com.gameList.gamelist.model.Xbox;
import com.gameList.gamelist.service.GameListService;

@Controller
@RequestMapping("/game-list")
public class GameListController{
	
	/**
	 * This will be used to search for games
	 */
	//private List<Nintendo> listNintendo;
	private List<Platform> platformList;
	//private List<Xbox> xbox_list;
	//private List<PC> listPC;
	//private List<Playstation> listPlaystation;
	
	@PostConstruct
	private void loadData() {
		// Platforms
		platformList = new ArrayList<Platform>();
		
		Platform platform1 = new Platform(1,"pc");
		Platform platform2 = new Platform(2,"xbox");
		Platform platform3 = new Platform(3,"playstation");
		Platform platform4 = new Platform(4,"nintendo");
		platformList.add(platform4);
		platformList.add(platform3);
		platformList.add(platform2);
		platformList.add(platform1);
		
	}
	public GameListService gameList;
	public GameListController(GameListService theGameList) {
		gameList = theGameList;
	}
	/**
	 * SETUP NEEDED:
	 * Note: it has the same admin and password we used in class
	 * 1. On phpMyAdmin you will have to make a database called "game_list" and a table called "gamelist"
	 * 2. this table will have 4 columns id(primary key + auto increment), gamename, console and year
	 * 3. add any information you want on on these columns on the insert menu on the top right on the phpMyAdmin
	 * @param theModel
	 * @return a list of all games in the database
	 */
	@GetMapping("/platform")
	public String platform(Model theModel) {
		theModel.addAttribute("platform", platformList);
		
		return "platforms";
	}
	@GetMapping("/list")
	public String listGames(Model theModel) {
		List<GameList> theGamelist = gameList.findAll();
		theModel.addAttribute("gamelist", theGamelist);
		return "list-GameList";
	}
	
}