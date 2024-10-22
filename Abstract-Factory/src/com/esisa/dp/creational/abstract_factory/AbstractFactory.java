package com.esisa.dp.creational.abstract_factory;

import javax.swing.JComponent;
import javax.swing.text.JTextComponent;


public interface AbstractFactory {
	
	
	public JTextComponent CreateProductA(int width);
	public JComponent CreateProductB(Object data[][]);
	public JComponent CreateProductC(String... choices);
}
