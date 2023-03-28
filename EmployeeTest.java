package com.demo;

public class EmployeeTest {

	public static void main(String[] args) {
		Department d1 = new Department(1, "HR", "Pune");
		Department d2 = new Department(2, "Technical", "Mumbai");

		Employee e1 = new Employee(101, "Vivek", 8000f, d1);
		Employee e2 = new Employee(102, "Amol", 98000f, d2);
		Employee e3 = new Employee(101, "Vijay", 88000f, d2);

		System.out.println(e1.getDept().getDname());
		System.out.println(d1.getDname());

		if (e1.getSalary() > 50000) {
			System.out.println(e1);
		}
		if (e2.getSalary() > 50000) {
			System.out.println(e2);
		}

	}

}
