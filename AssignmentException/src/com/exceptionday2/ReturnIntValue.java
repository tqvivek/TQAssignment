package com.exceptionday2;

import java.util.Scanner;

public class ReturnIntValue {
	public static int sum(int num1, int num2) {
		int a = 10;
		int b = 10;
		int sum = a + b;
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number:");
		int num2 = sc.nextInt();
		int sum = sum(num1, num2);
		try {
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(sum);
		}
		sc.close();
	}
}
