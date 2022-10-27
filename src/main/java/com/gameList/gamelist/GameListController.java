package com.gameList.gamelist;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gameList.gamelist.model.Nintendo;
import com.gameList.gamelist.model.PC;
import com.gameList.gamelist.model.Playstation;
import com.gameList.gamelist.model.Platform;

@Controller
@RequestMapping("/game-list")
public class GameListController{
	
	/**
	 * This will be used to search for games
	 */
	private List<Platform> platformList;
	
	private List<Nintendo> listNintendo;
	private List<PC> listPC;
	private List<Playstation> listPlaystation;
	
	@PostConstruct
	private void loadData() {
		// Platforms
		platformList = new ArrayList<Platform>();
		
		Platform platform1 = new Platform(1, "pc");
		Platform platform2 = new Platform(2, "xbox");
		Platform platform3 = new Platform(3, "playstation");
		Platform platform4 = new Platform(4, "nintendo");
		
		platformList.add(platform1);
		platformList.add(platform2);
		platformList.add(platform3);
		platformList.add(platform4);
		
		// Nintendo
		listNintendo = new ArrayList<Nintendo>();
		Nintendo nintendoGame1 = new Nintendo(1, "Mario Party", "60.00", "N64");
		Nintendo nintendoGame2 = new Nintendo(2, "Mario Party 2", "60.00", "N64");
		Nintendo nintendoGame3 = new Nintendo(3, "Mario Party 3", "60.00", "N64");		
		
		listNintendo.add(nintendoGame1);
		listNintendo.add(nintendoGame2);
		listNintendo.add(nintendoGame3);
		
		// PC
		listPC = new ArrayList<PC>();
		PC pcGame1 = new PC(1, "Call of Duty", "19.99", "PC");
		PC pcGame2 = new PC(2, "Call of Duty 2", "39.99", "PC");
		PC pcGame3 = new PC(3, "Call of Duty 3", "59.99", "PC");		
		
		listPC.add(pcGame1);
		listPC.add(pcGame2);
		listPC.add(pcGame3);
		
		// Playstation
		listPlaystation = new ArrayList<Playstation>();
		Playstation playstationGame1 = new Playstation(1, "The Last of Us", "19.99", "PS3");
		Playstation playstationGame2 = new Playstation(2, "God of War", "39.99", "PS5");
		Playstation playstationGame3 = new Playstation(3, "Bloodborne", "59.99", "PS4");		
		
		listPlaystation.add(playstationGame1);
		listPlaystation.add(playstationGame2);
		listPlaystation.add(playstationGame3);
	}
	
	@GetMapping("/platform")
	public String platform(Model theModel) {
		theModel.addAttribute("platform", platformList);
		
		return "platforms";
	}
	
	@GetMapping("/nintendo")
	public String listNintendo(Model theModel) {
		theModel.addAttribute("nintendo", listNintendo);
		
		return "list-nintendo";
	}
	
	@GetMapping("/pc")
	public String listPC(Model theModel) {
		theModel.addAttribute("pc", listPC);
		
		return "list-pc";
	}
	
	@GetMapping("/playstation")
	public String listPlaystation(Model theModel) {
		theModel.addAttribute("playstation", listPlaystation);
		
		return "list-playstation";
	}
}