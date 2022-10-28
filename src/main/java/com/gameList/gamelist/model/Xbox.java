package com.gameList.gamelist.model;

public class Xbox {
	private int id;
	private String gameName;
	private String price;
	private String console;
	
	public Xbox (int id, String gameName, String price, String console) {
		this.setId(id);
		this.setGameName(gameName);
		this.setPrice(price);
		this.setConsole(console);
	}
	
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
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getConsole() {
		return console;
	}
	
	public void setConsole(String console) {
		this.console = console;
	}

	@Override
	public String toString() {
		return "Xbox [id=" + id + ", gameName=" + gameName + ", price=" + price + ", console=" + console + "]";
	}
	
}
