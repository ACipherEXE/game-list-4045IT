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
import com.gameList.gamelist.model.Xbox;

@Controller
@RequestMapping("/game-list")
public class GameListController{
	
	/**
	 * This will be used to search for games
	 */
	
	private List<Nintendo> listNintendo;
	private List<Platform> platformList;
	private List<Xbox> xbox_list;
	
	@PostConstruct
	private void loadData() {
		Nintendo game1 = new Nintendo(1,"Mario Party","60.00","N64");
		Nintendo game2 = new Nintendo(2,"Mario Party 2","60.00","N64");
		Nintendo game3 = new Nintendo(3,"Mario Party 3","60.00","N64");
		
		Platform platform1 = new Platform(1,"pc");
		Platform platform2 = new Platform(2,"xbox");
		Platform platform3 = new Platform(3,"playstation");
		Platform platform4 = new Platform(4,"nintendo");
		
		Xbox xbox1 = new Xbox(1,"Halo", "xbox");
		Xbox xbox2 = new Xbox(1,"Halo 2", "xbox");
		Xbox xbox3 = new Xbox(1,"Halo 3", "xbox");
		Xbox xbox4 = new Xbox(1,"Halo 4", "xbox");
		Xbox xbox5 = new Xbox(1,"Halo 5", "xbox");
		
		listNintendo = new ArrayList();
		
		platformList = new ArrayList();
		
		xbox_list = new ArrayList();
		
		listNintendo.add(game1);
		listNintendo.add(game2);
		listNintendo.add(game3);
		
		platformList.add(platform1);
		platformList.add(platform2);
		platformList.add(platform3);
		platformList.add(platform4);
		
		 xbox_list.add(xbox1);
		 xbox_list.add(xbox2);
		 xbox_list.add(xbox3);
		 xbox_list.add(xbox4);
		 xbox_list.add(xbox5);
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
	@GetMapping("/xbox")
	public String xbox_list(Model theModel) {
		theModel.addAttribute("xbox",  xbox_list);
		return" xbox_list";
	}
}