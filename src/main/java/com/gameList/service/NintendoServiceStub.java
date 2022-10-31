package com.gameList.service;

import java.util.ArrayList;

import com.gameList.gamelist.model.Nintendo;

public class NintendoServiceStub implements INintendoService{
	
	@Override
	public ArrayList<Nintendo> nintendoListCreator() {
		ArrayList<Nintendo> listNintendo = new ArrayList<Nintendo>();
		Nintendo nintendoGame1 = new Nintendo(1, "Mario Party", "60.00", "N64");
		Nintendo nintendoGame2 = new Nintendo(2, "Mario Party 2", "60.00", "N64");
		Nintendo nintendoGame3 = new Nintendo(3, "Mario Party 3", "60.00", "N64");		
		
		listNintendo.add(nintendoGame1);
		listNintendo.add(nintendoGame2);
		listNintendo.add(nintendoGame3);
		
		return listNintendo;
	}

}
