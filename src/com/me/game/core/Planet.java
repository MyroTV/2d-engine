package com.me.game.core;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.me.game.graphics.GUIRenderer;
import com.me.game.graphics.Renderer;
import com.me.game.graphics.Sprite;
import com.me.game.graphics.Texture;
import com.me.game.interfaces.CellestialObject;
import com.me.game.interfaces.Renderable;

public class Planet implements CellestialObject, Renderable {
	
	//render variables
	private Sprite pSprite;
	private Texture pTexture;
	private BufferedImage pImage;
	
	//planet variables
	private String pName;
	private int population;
	private int pSize; //this will determine number of build slots
	private float percentageOfPlanetHabitable; //how much of the planet is habitable
	private boolean habitable;
	private ArrayList<Buildings> listOfBuildings;
	private ArrayList<Buildings> buildQueue;
	
	
	//renderers
	private GUIRenderer guiRenderer;
	private Renderer renderer;
	
	public Planet(String pName, int population) {
		
	}
	
	public void update() {
		
	}

	public int getWidth() { //return entity width
		return 0;
	}

	public int getHeight() { //return entity height
		return 0;
	}

	public Sprite getPlanetSprite() {
		return pSprite;
	}

	public void setpSprite(Sprite pSprite) {
		this.pSprite = pSprite;
	}

	public Texture getPlanetTexture() {
		return pTexture;
	}

	public void setPlanetTexture(Texture pTexture) {
		this.pTexture = pTexture;
	}

	public String getPlanetName() {
		return pName;
	}

	public void setPlanetName(String pName) {
		this.pName = pName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getPlanetSize() {
		return pSize;
	}

	public void setPlanetSize(int pSize) {
		this.pSize = pSize;
	}

	public float getPercentageOfPlanetHabitable() {
		return percentageOfPlanetHabitable;
	}

	public void setPercentageOfPlanetHabitable(float percentageOfPlanetHabitable) {
		this.percentageOfPlanetHabitable = percentageOfPlanetHabitable;
	}

	public boolean isHabitable() {
		return habitable;
	}

	public void setHabitable(boolean habitable) {
		this.habitable = habitable;
	}

	public ArrayList<Buildings> getBuildQueue() {
		return buildQueue;
	}

	public void setBuildQueue(ArrayList<Buildings> buildQueue) {
		this.buildQueue = buildQueue;
	}

	public GUIRenderer getGuiRenderer() {
		return guiRenderer;
	}

	public void setGuiRenderer(GUIRenderer guiRenderer) {
		this.guiRenderer = guiRenderer;
	}

	public Renderer getRenderer() {
		return renderer;
	}

	public void setRenderer(Renderer renderer) {
		this.renderer = renderer;
	}

	public ArrayList<Buildings> getListOfBuildings() {
		return listOfBuildings;
	}

	public void render(Graphics g) {
		
	}
	
	public void determineHabitability() {
		
	}

}
