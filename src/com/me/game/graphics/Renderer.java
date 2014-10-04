package com.me.game.graphics;

import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import com.me.game.interfaces.Renderable;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

import com.me.game.graphics.Render;
import com.me.game.graphics.Screen;
import com.me.game.graphics.Sprite;
import com.me.game.graphics.Texture;

public class Renderer extends Canvas implements Runnable {
	private ArrayList<Renderable> renderables = new ArrayList<>();
	private BufferStrategy bs;
	private Graphics g;
	
	public Renderer() {
		
	}
	
	public Renderer(Graphics g) {
		this.g = g;
	}
	
	public void render() {
		
	}
	
	public void start() {
		this.bs = this.getBufferStrategy();
		if(bs == null) {
			createBufferStrategy(3);
			return;
		}
	}

	public void run() {

	}
	
	public void addRenderable() {
		
	}
	
	public void removeRenderable() {
		
	}
}
