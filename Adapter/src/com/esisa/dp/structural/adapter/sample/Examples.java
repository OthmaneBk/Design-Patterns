package com.esisa.dp.structural.adapter.sample;

import javax.swing.JFrame;

import com.esisa.dp.structural.adapter.Client;
import com.esisa.dp.structural.adapter.target;
import com.esisa.dp.structural.adapter.class_adapter.ClassAdapter1;
import com.esisa.dp.structural.adapter.class_adapter.ClassAdapter2;
import com.esisa.dp.structural.adapter.class_adapter.ClassAdapter3;
import com.esisa.dp.structural.adapter.sample.class_Adapter.CirecleAdapter;
import com.esisa.dp.structural.adapter.sample.class_Adapter.LineAdapter;
import com.esisa.dp.structural.adapter.sample.class_Adapter.RectangleAdapter;

public class Examples extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Screen screen;
	
	
	public Examples() {
		screen=new Screen(800, 500);
		init();
		setContentPane(screen);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	void init() {
		screen.add(new CirecleAdapter(100, 200, 80));
		
		screen.add(new RectangleAdapter(200, 100, 180, 150));
		
		screen.add(new LineAdapter(200, 300, 180, 150));
		
	}

	
	public static void main(String[] args) {
		new Examples();
	}
}
