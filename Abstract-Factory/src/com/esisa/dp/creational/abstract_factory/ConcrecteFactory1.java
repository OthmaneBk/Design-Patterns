package com.esisa.dp.creational.abstract_factory;


import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class ConcrecteFactory1 implements AbstractFactory{

	public ConcrecteFactory1() {
		
	}
	

	@Override
	public JComponent CreateProductB(Object[][] data) {
		
		String rows[] =new String[data.length];
		for (int i = 0; i < rows.length; i++) {
			rows[i]=Arrays.toString(data[i]);
		}
		JList<String> list=new JList<String>(rows);
		return list;
	}

	@Override
	public JComponent CreateProductC(String... choices) {
		return new JComboBox<String>(choices);
	}

	@Override
	public JTextComponent CreateProductA(int width) {
		return new JTextField(width);
	}

}
