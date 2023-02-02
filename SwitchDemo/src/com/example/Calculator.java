/***4. Write a Java program to create Simple Calculator using 
 switch case Menu Driven*******/

package com.example;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose an operator:+,-,*,/");
		char ch = sc.next().charAt(0);

		System.out.println("Enter the first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int n2 = sc.nextInt();

		int result;

		switch (ch) {
		case '+':
			result = n1 + n2;
			System.out.println("Addition:" + result);
			break;

		case '-':
			result = n1 - n2;
			System.out.println("Subtraction:" + result);
			break;

		case '*':
			result = n1 * n2;
			System.out.println("Multiplication:" + result);
			break;

		case '/':
			result = n1 / n2;
			System.out.println("Division:" + result);
			break;

		default:
			System.out.println("Invalid");

		}

	}
}
