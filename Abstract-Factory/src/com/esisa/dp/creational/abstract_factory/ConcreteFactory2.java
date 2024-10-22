package com.esisa.dp.creational.abstract_factory;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;


public class ConcreteFactory2 implements AbstractFactory{

	private String titles[];
	private int textRows=3;
	
	public ConcreteFactory2(String... titles) {
		this.titles=titles;
	}
	
	public ConcreteFactory2(int textRows, String... titles) {
		this.titles=titles;
		this.textRows=textRows;
	}
	
	@Override
	public JTextComponent CreateProductA(int width) {
		return new JTextArea(textRows,width);
	}

	@Override
	public JComponent CreateProductB(Object[][] data) {
		return new JTable(data,titles);
	}

	@Override
	public JComponent CreateProductC(String... choices) {
		JPanel p=new JPanel(new FlowLayout(FlowLayout.LEFT));
		ButtonGroup group=new ButtonGroup();
		for (String choice:choices) {
			JRadioButton b=new JRadioButton(choice);
			group.add(b);
			p.add(b);
		}
		
		return p;
	}
	
}
