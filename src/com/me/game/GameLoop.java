package com.me.game;

import com.me.game.controls.Mouse;

public abstract class GameLoop implements Runnable {
	
	private boolean running = false;
	
	private Thread thread;
	private Display d;
	
	protected final void createDisplay(String title, int width, int height) {
		d = new Display(new GameWindow(title, width, height));
		d.init();
		d.show();
	}

	protected final void start() {
		running = true;
		thread = new Thread(this, "Game Loop");
		thread.start();
	}
	
	protected final void setInput(int device) {
		d.enable((byte) device);
	}
	
	public final void run() {
		while(running == true) {
			Mouse.calculateMouseCoordsOnDisplay(d);
			//System.out.println(Mouse.getX() + " , " + Mouse.getY()); //print won't work, println is synchronised and will work.
			render();
		}
	}
	
	public void render() {
		d.render();
	}
}
