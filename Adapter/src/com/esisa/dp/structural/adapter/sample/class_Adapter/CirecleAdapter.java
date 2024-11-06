package com.esisa.dp.structural.adapter.sample.class_Adapter;

import java.awt.Graphics;

import com.esisa.dp.structural.adapter.sample.Circle;
import com.esisa.dp.structural.adapter.sample.Shape;

public class CirecleAdapter extends Circle implements Shape{


	public CirecleAdapter(int x, int y, int ray) {
		super(x, y, ray);
	}

	@Override
	public void paint(Graphics g) {
		draw(g);
	}

}
