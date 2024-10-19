package com.esisa.dp.creationa.builder;

public interface Builder {
	
	public void init();
	public void setRow(String... row);
	public void filter(String keyword);
	public void constract();
	
	public Object getResult();
}
