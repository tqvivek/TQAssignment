package com.demo;

public class DriverTest {

	public static void main(String[] args) {

		Car c1 = new Car(1, "Tata", "Jaguar");
		Car c2 = new Car(2, "Maruti Suzuki", "Swift");

		Driver d1 = new Driver("Vivek", 123, 5, c1);
		Driver d2 = new Driver("Suyog", 345, 7, c1);
		Driver d3 = new Driver("Omkar", 456, 9, c2);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		System.out.println("-----------------------");

		c1.setBrand("BMW");

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		System.out.println("------------------------");

		Driver d4 = new Driver("Sachin", 987);
		System.out.println(d4);

		d4.setCar(c2);
		System.out.println(d4);

	}

}
