package com.me.game.gui;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

import com.me.game.Display;
import com.me.game.GameLoop;
import com.me.game.controls.Mouse;
import com.me.game.interfaces.GUIElement;

public class Label extends Component implements GUIElement {

	private static final long serialVersionUID = 1L;
	Font f;
	
	public int getWidth() {
		return 0;
	}

	public int getHeight() {
		return 0;
	}

	public void render(Graphics g) {

	}

	public void start() {
		f =  new Font("Arial", Font.PLAIN, 24);
		addMouseListener(new Mouse(1.0));
	}
	public boolean inFocus() {
		return false;
	}

}
