//Write a Java program to find sum of all odd numbers between 1 to n.
package com.loops;

import java.util.Scanner;

public class SumOfOddNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of first " + n + " odd number is:" + sum);

	}

}
