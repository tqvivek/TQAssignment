package com.demo;

public class Person {
	private String name;
	private String gender;
	private int age;
	private String address;

	public Person() {

	}

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public Person(String name, String gender, int age, String address) {
		this(name, gender);
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + "]";
	}

}
