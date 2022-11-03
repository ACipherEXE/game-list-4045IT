package com.gameList.gamelist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="game_list")
public class GameList {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="gameName")
	private String gameName;
	@Column(name="year")
	private String year;
	@Column(name="console")
	private String console;
	@Column(name="description")
	private String description;
	
	
	public GameList() {
		
	}
	public GameList(int id, String gameName, String year, String console, String description) {
		this.setId(id);
		this.setGameName(gameName);
		this.setYear(year);
		this.setConsole(console);
		this.setDescription(description);
	}
	//Get/set area
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//toString Method
	@Override
	public String toString() {
		return "GameList [id="+id + ", gameName="+gameName +", year="+year +", console="+console+", description="+description+"]";
	}
}
