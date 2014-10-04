package com.me.game.gui;

import java.awt.Graphics;
import java.util.ArrayList;

import com.me.game.core.Planet;
import com.me.game.graphics.Sprite;
import com.me.game.graphics.Texture;
import com.me.game.interfaces.GUIElement;

public class PlanetScreen implements GUIElement {

	private Label planetLabel;
	private Button pUpButton, pDownButton, fUpButton, fDownButton, cUpButton, cDownButton;
	private ScrollList constructionList, buildingsList, fleetList;
	private ArrayList<ScrollListElement> cListElement, bListElement, fListElement;
	private Sprite planetScreenSprite;
	private Sprite planetImage;
	private int x, y;
	private boolean isActive = false;
	private int drawHierarchy = 2;
	private Planet planet;
	
	private Texture psTex;
	
	public PlanetScreen(Planet planet) {
		this.planet = planet;
	}
	
	public PlanetScreen() {
		
	}
	
	public int getWidth() {
		return 0;
	}

	public int getHeight() {
		return 0;
	}
	
	public void init() {
		psTex = new Texture("res/planetScreenTemp.png");
		planetScreenSprite = new Sprite(psTex);
	}

	public void render(Graphics g) {
		planetScreenSprite.render(g);
	}

	public boolean inFocus() {
		return false;
	}
	
	public Sprite getSprite() {
		return this.planetScreenSprite;
	}
	
	public int getDrawHierarchy() {
		return this.drawHierarchy;
	}

}
