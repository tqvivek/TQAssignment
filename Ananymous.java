package com.demo;

public class Ananymous {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Suyog", 94000f, new Department(101, "HR", "Pune"));
		Employee e2 = new Employee(102, "Omkar", 98000f, new Department(101, "HR", "Delhi"));

		System.out.println(e1);
		System.out.println(e2);

	}

}
