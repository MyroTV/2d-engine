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

	public void render(Graphics g) {
		
	}
	
	public void determineHabitability() {
		
	}

}
