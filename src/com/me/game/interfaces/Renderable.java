package com.me.game.interfaces;

import java.awt.Graphics;

public interface Renderable {
	
	public int getWidth();
	public int getHeight();
	public void render(Graphics g);
}
