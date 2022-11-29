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
	private List<Nintendo> listNintendo;
	private List<Platform> platformList;
	private List<Xbox> xbox_list;
	private List<PC> listPC;
	private List<Playstation> listPlaystation;
	
	@PostConstruct
	private void loadData() {
		//Platforms
		//Create Faculties
		Platform platform1 = new Platform(1,"pc");
		Platform platform2 = new Platform(2,"xbox");
		Platform platform3 = new Platform(3,"playstation");
		Platform platform4 = new Platform(4,"nintendo");
		Platform platform5 = new Platform(5, "list");
		
		//Create List
		platformList = new ArrayList<Platform>();
		
		//Add to our List
		platformList.add(platform1);
		platformList.add(platform2);
		platformList.add(platform3);
		platformList.add(platform4);
		platformList.add(platform5);
		
		//Xbox
		//Create Faculties
		Xbox xbox1 = new Xbox(1,"Halo", "xbox");
		Xbox xbox2 = new Xbox(2,"Halo 2", "xbox");
		Xbox xbox3 = new Xbox(3,"Halo 3", "xbox");
		Xbox xbox4 = new Xbox(4,"Halo 4", "xbox");
		Xbox xbox5 = new Xbox(5,"Halo 5", "xbox");
		
		//Create List
		xbox_list = new ArrayList<Xbox>();

		//Add to our List
		 xbox_list.add(xbox1);
		 xbox_list.add(xbox2);
		 xbox_list.add(xbox3);
		 xbox_list.add(xbox4);
		 xbox_list.add(xbox5);
	
		
		// Nintendo
		//Create Faculties
		Nintendo nintendoGame1 = new Nintendo(1, "Mario Party", "60.00", "N64");
		Nintendo nintendoGame2 = new Nintendo(2, "Mario Party 2", "60.00", "N64");
		Nintendo nintendoGame3 = new Nintendo(3, "Mario Party 3", "60.00", "N64");	
		
		//Create List
		listNintendo = new ArrayList<Nintendo>();
		
		//Add to our List
		listNintendo.add(nintendoGame1);
		listNintendo.add(nintendoGame2);
		listNintendo.add(nintendoGame3);
		
		// PC
		//Create Faculties
		PC pcGame1 = new PC(1, "Call of Duty", "19.99", "PC");
		PC pcGame2 = new PC(2, "Call of Duty 2", "39.99", "PC");
		PC pcGame3 = new PC(3, "Call of Duty 3", "59.99", "PC");		
		
		//Create List
		listPC = new ArrayList<PC>();
		
		//Add to our List
		listPC.add(pcGame1);
		listPC.add(pcGame2);
		listPC.add(pcGame3);
		
		// Playstation
		//Create Faculties
		Playstation playstationGame1 = new Playstation(1, "The Last of Us", "19.99", "PS3");
		Playstation playstationGame2 = new Playstation(2, "God of War", "39.99", "PS5");
		Playstation playstationGame3 = new Playstation(3, "Bloodborne", "59.99", "PS4");
		
		//Create List
		listPlaystation = new ArrayList<Playstation>();
		
		//Add to our List
		listPlaystation.add(playstationGame1);
		listPlaystation.add(playstationGame2);
		listPlaystation.add(playstationGame3);
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
	@GetMapping("/xbox")
	public String xbox_list(Model theModel) {
		theModel.addAttribute("xbox",  xbox_list);
		return"xbox";
	}
	
}