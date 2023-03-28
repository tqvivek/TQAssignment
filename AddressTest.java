package com.demo;

public class AddressTest {

	public static void main(String[] args) {

		Person p1 = new Person("Vivek", "Male");
		Person p2 = new Person("Pooja", "Female");

		Address a1 = new Address("Pune", "Maharashtra", "India", p1);
		Address a2 = new Address("Dehradun", "Delhi", "India", p2);
		Address a3 = new Address("Guvahati", "Asam", "India", p1);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println("-------------------------------");

		p1.setName("Virat");

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println("--------------------------------------");
		Address a4 = new Address("Guvahati", "Asam", "India", p1);
		System.out.println(a4);

	}

}
