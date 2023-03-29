package com.demo;

public class Manager extends Employee {
	private int exp;
	private float bonus;
	private String pos;

	public Manager() {
		super();

	}

	public Manager(int eid, String name, float salary, int exp, float bonus, String pos) {
		super(eid, name, salary);
		this.exp = exp;
		this.bonus = bonus;
		this.pos = pos;
	}

	public String toString() {
		return getEid() + " " + getName() + " " + getSalary() + " " + exp + " " + bonus + " " + pos;
	}

	public static void main(String[] args) {

		Manager m1 = new Manager();
		System.out.println(m1);

		Manager m2 = new Manager(1, "Vivek", 98000f, 3, 9f, "Head");
		System.out.println(m2);

		Employee e1 = new Employee(2, "Aniket", 3766f);
		System.out.println(e1);

	}

}
