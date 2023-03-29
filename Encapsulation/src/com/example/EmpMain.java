package com.example;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();

		System.out.println("Enter 1st Employee Details........");
		System.out.println("Enter the employee id:");
		e1.setEmpid(sc.nextInt());

		System.out.println("Enter the employee name:");
		e1.setEmpName(sc.next());

		System.out.println("Enter the employee salary:");
		e1.setEmpSalary(sc.nextDouble());

		System.out.println("--------------------------------------");

		Employee e2 = new Employee();

		System.out.println("Enter 2nd Employee details......");
		System.out.println("Enter the employee id:");
		e2.setEmpid(sc.nextInt());

		System.out.println("Enter the employee name:");
		e2.setEmpName(sc.next());

		System.out.println("Enter the employee salary:");
		e2.setEmpSalary(sc.nextDouble());

		System.out.println("--------------------------------------");

		System.out.println("Employee Id:" + e1.getEmpid());
		System.out.println("Employee Name:" + e1.getEmpName());
		System.out.println("Employee Salary:" + e1.getEmpSalary());

		System.out.println("----------------------------------------");

		System.out.println("Employee Id:" + e2.getEmpid());
		System.out.println("Employee Name:" + e2.getEmpName());
		System.out.println("Employee Salary:" + e2.getEmpSalary());

	}

}
