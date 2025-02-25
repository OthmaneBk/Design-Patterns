package com.esisa.dp.creationa.builder;


public class DesingPattern {
	private int id;
	private String name;
	private String category;
	private String intent;
	
	public DesingPattern() {
		
	}

	public DesingPattern(int id, String name, String category, String intent) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.intent = intent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIntent() {
		return intent;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	@Override
	public String toString() {
		return "DesingPattern [id=" + id + ", name=" + name + ", category=" + category + ", intent=" + intent + "]";
	}
	
	
}
