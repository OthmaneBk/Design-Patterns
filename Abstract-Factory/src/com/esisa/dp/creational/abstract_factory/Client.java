package com.esisa.dp.creational.abstract_factory;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.JTextComponent;

public class Client extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	
	private AbstractFactory factory;
	private Object data[][]= {
			{1,"Singletion","creational"},
			{4,"Abstract Factory","creational"},
			{7,"Bridge","Structural"},
			{8,"Composite","Structural"},
			{13,"Chain of Responsibility","Behaviorl"},
	};
	private String choices[]= {"creational","Strutural","Behavior"};
	
	public Client(AbstractFactory factory) {
		this.factory=factory;
	}
	
	public void create() {
		JPanel p=new JPanel();
		
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		
		JTextComponent a1 =factory.CreateProductA(50);
		JTextComponent a2 =factory.CreateProductA(50);
		JComponent b1 =factory.CreateProductB(data);
		JComponent c1 =factory.CreateProductC(choices);
		
		JPanel p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JLabel("Design Pattern: "));
		p1.add(new JScrollPane(a1));
		p.add(p1);
		
		JPanel p2=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2.add(new JLabel("Intent: "));
		p2.add(new JScrollPane(a2));
		p.add(p2);
		
		JPanel p3=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p3.add(new JLabel("Catecory: "));
		p3.add(new JScrollPane(c1));
		p.add(p3);
		
		JPanel p4=new JPanel(new BorderLayout());
		p4.add("North",new JLabel("Catalogue: "));
		p4.add("Center",new JScrollPane(b1));
		p.add(p4);
		
		setContentPane(p);
		setSize(800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//Client client2=new Client(new ConcrecteFactory1()); //comment client dependant de l'interface
		Client client2=new Client(new ConcreteFactory2("Id","Name","Catrgory"));
		client2.create();
	}
}
