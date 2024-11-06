package com.esisa.dp.structural.adapter.sample;

import java.awt.Graphics;

public class Rectangle {
	

	private int x1, y1;
	private int width, height;
	
	
	
	public Rectangle(int x1, int y1, int width, int height) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.width = width;
		this.height = height;
	}



	public void render(Graphics g) {
		g.drawRect(x1, y1, width, height);
	}
}
