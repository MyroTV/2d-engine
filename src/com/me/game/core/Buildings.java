package com.me.game.core;

import com.me.game.interfaces.Building;

public class Buildings implements Building {
	
	private String bName = "";
	private int numberOfThisBuilding = 0;
	private int buildingMoneyCost = 0;
	private int buildingMaterialCost = 0;
	
	public Buildings(String bName, int buildingMoneyCost, int buildingMaterialCost) {
		this.bName = bName;
		this.buildingMoneyCost = buildingMoneyCost;
		this.buildingMaterialCost = buildingMaterialCost;
	}
	
	public String getBuildingName() {
		return this.bName;
	}

	public int getNumberOfThisBuilding() {
		return this.numberOfThisBuilding;
	}

	public int getBuildingMoneyCost() {
		return 0;
	}

	public int getBuildingMaterialCost() {
		return 0;
	}
	
	public void upgrade() {
		this.numberOfThisBuilding++;
	}

}
