package com.esisa.dp.creationa.builder;

import java.io.BufferedReader;
import java.io.FileReader;

public class Director {
	private Builder builder;
	
	public Director() {
		
	}

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Object construct(String source, String keyword) {
		builder.init();
		try {
			BufferedReader in=new BufferedReader(new FileReader(source));
			String row=in.readLine();
			
			while(row !=null) {
				String data[]=row.split(";");
				builder.setRow(data);
				builder.filter(keyword);
				row=in.readLine();
			}
			builder.constract();
			
			in.close();
			return builder.getResult();
		} catch (Exception e) {
			System.out.println("Erreur :"+e.getMessage());
			return null;
		}
	}
}
