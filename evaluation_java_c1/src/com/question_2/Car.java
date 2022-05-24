package com.question_2;

public class Car {
	private String model;
	private String companyName;
	private String color;
	private String engine;
	
	public Car() {

	}
	public Car(String model, String companyName, String color, String engine) {

		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = engine;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	

}
