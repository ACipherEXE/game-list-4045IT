package com.gameList.gamelist.model;

public class Platform {
	private int id;
	private String platformName;
	
	public Platform(int id, String platformName) {
		this.setId(id);
		this.setPlatformName(platformName);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	@Override
	public String toString() {
		return "Platform[id="+ id +", platform="+platformName+"]";
	}

}
