package com.gameList.gamelist.model;

public class Xbox {
	private int id;
	private String xbox;
	private String console;
	
	public Xbox(int id, String xbox, String console) {
		this.setId(id);
		this.setXbox(xbox);
		this.setConsole(console);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getXbox() {
		return xbox;
	}

	public void setXbox(String platformName) {
		this.xbox = platformName;
	}
	
	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}
	@Override
	public String toString() {
		return "Xbox[id="+ id +", xbox="+xbox +" console= "+console+"]";
	}

}