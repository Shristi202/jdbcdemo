package com.telstra;

public class Player {
	private String name;
	
	private String alias;
	
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	private String team;
	
	private int maxSpeed;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	

	@Override
	public String toString() {
		return "Player [name=" + name + ", alias=" + alias + ", team=" + team + ", maxSpeed=" + maxSpeed + "]";
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	
	

}
