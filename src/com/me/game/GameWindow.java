package com.me.game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import com.me.game.graphics.Screen;

public class GameWindow extends Canvas {
	
	private int width;
	private int height;
	private String title;
	private JFrame frame;
	
	private Screen mainMenuScreen;
	
	public GameWindow(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		create();
	}
	
	private void create() {
		Dimension size = new Dimension(width, height);
		setMinimumSize(size);
		setMaximumSize(size);
		setPreferredSize(size);
		frame = new JFrame();
		frame.setTitle(title);
		frame.setResizable(false);
		frame.add(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
}
