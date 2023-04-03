//Write a Java program to calculate product of digits of any number.
package com.loops;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int num = n;
		int rem;
		int mult = 1;

		while (num > 0) {
			rem = num % 10;
			mult = mult * rem;
			num = num / 10;
		}
		System.out.println("Multiply of digit=" + mult);

	}

}
