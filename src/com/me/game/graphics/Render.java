package com.me.game.graphics;

public class Render {
	public final int width;
	public final int height;
	public final int[] pixels;
	
	public Render(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}
	
	public void draw(Render render, int xOffset, int yOffset) {
		for(int y = 0; y < render.width; y++) {
			int yPix = y + xOffset;
			for(int x = 0; x < render.height; x++) {
				int xPix = x + yOffset;
				
				pixels[xPix + yPix * width] = render.pixels[x + y * render.width];
			}
		}
	}
	
}
