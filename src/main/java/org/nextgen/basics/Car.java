package org.nextgen.basics;

public class Car {
	
	//Instance Variables
	String model;
	String make;
	int price;
	private float discount;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void getColor() {
		System.out.println("Color of the car is Grey");
	}
	
	
	
	public static Car getCar() {
		
		Car obj = new Car();
		//obj.make = "Tesla";
		obj.setMake("Tesla");
		//obj.model = "Model Y";
		obj.setModel("Model Y");
		
		Car lucid = new Car();
		return obj;
	}

}
