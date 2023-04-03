//Write a Java program to count number of digits in any number
package com.loops;

import java.util.Scanner;

public class NumOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int count = 0;

		while (num != 0) {
			num /= 10; // num=num/10;
			++count;
		}
		System.out.println("Number of digits:" + count);
	}
}
