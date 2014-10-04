package com.me.game.core;

import java.awt.Graphics;
import java.util.ArrayList;

import com.me.game.graphics.Sprite;
import com.me.game.graphics.Texture;
import com.me.game.interfaces.CellestialObject;
import com.me.game.interfaces.Renderable;

public class StarSystem implements CellestialObject, Renderable {
	
	private ArrayList<Planet> planets = new ArrayList<>();
	private String systemName;
	private Sprite starSprite;
	private Texture starTexture;
	
	public StarSystem() {
		
	}
	public void update() {
		
	}

	public int getWidth() {
		return 0;
	}

	public int getHeight() {
		return 0;
	}

	public void render(Graphics g) {
		
	}

}
