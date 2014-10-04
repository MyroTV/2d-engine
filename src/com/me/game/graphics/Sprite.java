package com.me.game.graphics;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;

import com.me.game.interfaces.Renderable;

public class Sprite extends Component implements Renderable {
	
	private int x, y, height, width;
	private Texture texture = null;
	
	public Sprite(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.setBounds(x, y, width, height);
	}
	
	public Sprite(Texture texture) {
		this.texture = texture;
		this.setBounds(0, 0, texture.getWidth(), texture.getHeight());
	}
	
	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;

	}
	
	public void render(Graphics g) {
		g.drawImage(this.texture.getImage(), 0, 0, null);
	}
	
	public void start() {

	}
	
	public Texture getTexture() {
		if(this.texture != null) {
			return texture;
		}
		else return null;
	}
	
	public void setTexture(Texture texture) {
		this.texture = texture;
	}

}
