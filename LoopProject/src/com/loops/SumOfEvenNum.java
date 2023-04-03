//Write a Java program to find sum of all even numbers between 1 to n. 
package com.loops;

import java.util.Scanner;

public class SumOfEvenNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of first " + n + " number is:" + sum);

	}

}
