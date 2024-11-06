package com.esisa.dp.structural.adapter.sample.class_Adapter;

import java.awt.Graphics;

import com.esisa.dp.structural.adapter.sample.Line;
import com.esisa.dp.structural.adapter.sample.Shape;

public class LineAdapter extends Line implements Shape{

	public LineAdapter(int x1,int y1,int x2,int y2){
		super(x1, y1, x2, y2);
	}



	@Override
	public void paint(Graphics g) {
		dessiner(g);
		
	}

}
