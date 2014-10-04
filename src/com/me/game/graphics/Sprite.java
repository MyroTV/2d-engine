package com.me.game.graphics;

import java.awt.Component;
import java.awt.Graphics;

import com.me.game.controls.Mouse;
import com.me.game.interfaces.Renderable;

public class Sprite extends Component implements Renderable {
	
	private int x,y;
	private Texture texture = null;
	
	public Sprite(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Sprite(Texture texture) {
		this.texture = texture;
	}
	
	public int getWidth() {
		return 0;
	}

	public int getHeight() {
		return 0;
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

}
