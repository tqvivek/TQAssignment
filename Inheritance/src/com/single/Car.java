package com.single;

class Car {
	int id;
	String name;
	double price;

	public void display(int id, String name, double price) {
		System.out.println("CarId:" + id);
		System.out.println("CarName:" + name);
		System.out.println("CarPrice:" + price);
	}

	public class RacingCar extends Car {
		double power;

		public void runFast() {
			System.out.println(power);
		}

	}

}
