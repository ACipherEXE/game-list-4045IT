package com.gameList.gamelist;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gameList.gamelist.model.Nintendo;

@Controller
@RequestMapping("/game-list")
public class GameListController{
	
	/**
	 * This will be used to search for games
	 */
	
	private List<Nintendo> listNintendo;
	
	@PostConstruct
	private void loadData() {
		Nintendo game1 = new Nintendo(1,"Mario Party","60.00","N64");
		Nintendo game2 = new Nintendo(2,"Mario Party 2","60.00","N64");
		Nintendo game3 = new Nintendo(3,"Mario Party 3","60.00","N64");
		
		listNintendo = new ArrayList();
		
		listNintendo.add(game1);
		listNintendo.add(game2);
		listNintendo.add(game3);
	}
	@GetMapping("/nintendo")
	public String listNintendo(Model theModel) {
		theModel.addAttribute("nintendo", listNintendo);
		return"list-nintendo";
	}
}