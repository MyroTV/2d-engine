package com.me.game;

import com.me.game.controls.Mouse;

public class Main extends GameLoop {
	
	private GameWindow gw = null;
	private Display d = null;

	protected void init() {
		createDisplay("Test Engine", 800, 600);
		setInput(Mouse.CODE);
		start();
	}
	
	public Display getDisplay() {
		return this.d;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}
}
