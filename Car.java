package com.demo;

public class Car {
	private int cnum;
	private String brand;
	private String model;

	public Car() {

	}

	public Car(int cnum, String brand, String model) {
		this.cnum = cnum;
		this.brand = brand;
		this.model = model;

	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [cnum=" + cnum + ", brand=" + brand + ", model=" + model + "]";

	}
}
