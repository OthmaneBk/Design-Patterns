package com.esisa.dp.creationa.builder;

import java.util.List;

public class Client {
	private String source="resources/design-patterns.txt";
	
	public Client() {
		application1();
	}
	
	void application1() {
		
		Director directore=new Director(new ConcreteBuilder1());
		List<DesingPattern> result= (List<DesingPattern>)directore.construct(source, "families");
		
		for (DesingPattern pattern : result) {
			System.out.println(pattern);
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}
