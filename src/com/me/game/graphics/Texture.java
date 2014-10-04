package com.me.game.graphics;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Texture {
	
	private BufferedImage img = null;
	private String filePath = null;
	private int x, y;
	
	public Texture(String filePath) {
		this.filePath = filePath;
		loadTexture(this.filePath);
	}
	
	public void loadTexture(String filePath) {
		try {
			img = ImageIO.read(new File(filePath));
		} catch (IOException e) {
			System.out.print("Texture loading failed for " + filePath);
		}
	}
	
	public void loadTexture(File file) {
		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			System.out.print("Texture loading failed!");
		}
	}
	
	public int getWidth() {
		return this.getImage().getWidth(null);
	}
	
	public int getHeight() {
		return this.getImage().getHeight(null);
	}
	
	public Image getImage() {
		if(this.img != null) {
			return img;
		}
		else return null;
	}
}
