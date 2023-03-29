package com.single;

public class Child extends Parent {
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.setName("Suraj");
		c1.setAge(15);
		c1.setMarks(91f);
		c1.setSchool("KMVW");

		System.out.println(c1.getName() + " " + c1.getMarks() + " " + c1.getAge() + " " + c1.getSchool());

	}

}
