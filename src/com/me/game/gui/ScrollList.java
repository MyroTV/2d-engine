package com.me.game.gui;

import java.awt.Graphics;

import com.me.game.interfaces.GUIElement;

public class ScrollList implements GUIElement {
		private int numberOfElementsDisplayed;
		private int x, y;
	
	public ScrollList(int numberOfElementsDisplayed) {
		this.numberOfElementsDisplayed = numberOfElementsDisplayed;
	}
	
	public ScrollList(int numberOfElementsDisplayed, int x, int y) {
		this.numberOfElementsDisplayed = numberOfElementsDisplayed;
	}
	
	public int getWidth() {
		return 0;
	}

	public int getHeight() {
		return 0;
	}

	public void render(Graphics g) {
		
	}

	public boolean inFocus() {
		return false;
	}

}
