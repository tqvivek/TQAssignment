package com.demo;

public class Employee {
	private int eid;
	private String ename;
	private float salary;
	private Department dept;

	public Employee() {
		super();

	}

	public Employee(int eid, String ename, float salary, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String toString() {
		return "EmpId:" + eid + "EmpName:" + ename + "Salary:" + salary + "Department:" + dept;
	}

}
