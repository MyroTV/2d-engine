package com.me.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.me.game.controls.Mouse;
import com.me.game.graphics.GUIRenderer;
import com.me.game.graphics.Renderer;
import com.me.game.graphics.Texture;
import com.me.game.gui.PlanetScreen;

public class Display extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	
	private GameWindow gw;
	private Graphics g;
	private BufferStrategy bs;
	private static double scale = 1.0;
	private Renderer renderer;
	private GUIRenderer guiRenderer;
	
	private Texture tex;
	private PlanetScreen ps;
	private static Mouse m = new Mouse(scale);

	public Display(GameWindow gw) {
		this.gw = gw;
	}
	
	public void setScale(double scale) {
		this.scale = scale;
	}
	
	protected void createBufferStrategy() {
		gw.createBufferStrategy(3);
	}
	
	public void enable(byte device) {
		gw.addMouseListener(m);
		System.out.println("Mouse enabled...");
	}
	
	public void show() {
		g.dispose();
		bs.show();
	}
	
	public void init() {
		m.setParentDisplay(this);
		createBufferStrategy();
		bs = gw.getBufferStrategy();
		g = bs.getDrawGraphics();
		
		renderer = new Renderer(this.g);
		guiRenderer = new GUIRenderer(this.g);
		
		//test
		tex = new Texture("res/spiral.png");
		ps = new PlanetScreen();
		ps.init();
	}
	
	public Graphics getGraphics() {
		if (g == null) {
		}
		return g;
	}
	
	public GameWindow getGameWindow() {
		return this.gw;
	}
	
	public void render() {
		g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 600); //background
		ps.render(g);
		g.drawImage(tex.getImage(), 300, 300, null);
		
		
		renderer.render();
		guiRenderer.render();
		
		g.dispose();
		bs.show();
	}
	
	public void run() {
		
	}
	
	public static Mouse getMouse() {
		return m;
	}
	
	public void RegisterMouseEvent(int buttonPressed) {
		if(ps.getSprite().getBounds().contains(Mouse.getX(), Mouse.getY())) {

		}
	}
}
