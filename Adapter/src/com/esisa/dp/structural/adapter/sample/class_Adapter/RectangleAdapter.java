package com.esisa.dp.structural.adapter.sample.class_Adapter;

import java.awt.Graphics;

import com.esisa.dp.structural.adapter.sample.Rectangle;
import com.esisa.dp.structural.adapter.sample.Shape;

public class RectangleAdapter extends Rectangle implements Shape{

	
	public RectangleAdapter(int x1, int y1, int width, int height) {
		super(x1, y1, width, height);
	}

	@Override
	public void paint(Graphics g) {
		render(g);
	}
	
	

}
