package com.esisa.dp.structural.adapter.sample;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Circle {

	private int x,y;
	private int ray;
	
	
	
	public Circle(int x, int y, int ray) {
		super();
		this.x = x;
		this.y = y;
		this.ray = ray;
	}


	public void draw(Graphics g) {
		g.drawOval(x-ray, y-ray, 2*ray, 2*ray);
	}
	
	
}
