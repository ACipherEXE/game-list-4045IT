package com.gameList.gamelist;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gameList.gamelist.model.Nintendo;
import com.gameList.gamelist.model.Platform;

@Controller
@RequestMapping("/game-list")
public class GameListController{
	
	/**
	 * This will be used to search for games
	 */
	
	private List<Nintendo> listNintendo;
	private List<Platform> platformList;
	
	@PostConstruct
	private void loadData() {
		Nintendo game1 = new Nintendo(1,"Mario Party","60.00","N64");
		Nintendo game2 = new Nintendo(2,"Mario Party 2","60.00","N64");
		Nintendo game3 = new Nintendo(3,"Mario Party 3","60.00","N64");
		
		Platform platform1 = new Platform(1,"pc");
		Platform platform2 = new Platform(2,"xbox");
		Platform platform3 = new Platform(3,"playstation");
		Platform platform4 = new Platform(4,"nintendo");
		
		listNintendo = new ArrayList();
		
		platformList = new ArrayList();
		
		listNintendo.add(game1);
		listNintendo.add(game2);
		listNintendo.add(game3);
		
		platformList.add(platform1);
		platformList.add(platform2);
		platformList.add(platform3);
		platformList.add(platform4);
	}
	@GetMapping("/nintendo")
	public String listNintendo(Model theModel) {
		theModel.addAttribute("nintendo", listNintendo);
		return"list-nintendo";
	}
	
	@GetMapping("/platform")
	public String platform(Model theModel) {
		theModel.addAttribute("platform", platformList);
		return"platforms";
	}
}