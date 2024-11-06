package com.esisa.dp.structural.adapter.sample;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;
import java.util.Vector;


import javax.swing.JPanel;

public class Screen extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private List<Shape> Shapes;
	private int width, height;
	
	
	public Screen(int width, int height) {

		this.width=width;
		this.height=height;
		Shapes=new Vector<Shape>();
	}
	
	public void add(Shape shape) {
		Shapes.add(shape);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		for (Shape shape : Shapes) {
			shape.paint(g);
		}
	}
	
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(width,height);
	}
	
}
