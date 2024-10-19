package com.esisa.dp.creationa.builder;

import java.util.List;
import java.util.Vector;

public class ConcreteBuilder1 implements Builder{
	
	
	private List<DesingPattern> result;
	private DesingPattern pattern;
	public ConcreteBuilder1() {
		
	}
	
	public List<DesingPattern> getResult() {
		return result;
	}

	
	public void init() {
		
		result=new Vector<DesingPattern>();
	}

	@Override
	public void setRow(String... row) {
		int id=0;
		try {
			id=Integer.parseInt(row[0]);
		} catch (Exception e) {}
		
		pattern=new DesingPattern(id,row[1],row[2],row[3]);
		
	}

	@Override
	public void filter(String keyword) {
		
		if(pattern.getIntent().toLowerCase().contains(keyword.toLowerCase())){
			result.add(pattern);
		}
	}

	@Override
	public void constract() {
		
		for (int i = 0; i < result.size(); i++) {
			int min=i;
			for (int j = i+1; j < result.size(); j++) {
				if(result.get(j).getName().compareTo(result.get(min).getName()) <0) {
					min=j;
				}
			}
			DesingPattern tmp=result.get(i);
			
			result.set(i, result.get(min));
			result.set(min, tmp);
		}
	}
	
}
