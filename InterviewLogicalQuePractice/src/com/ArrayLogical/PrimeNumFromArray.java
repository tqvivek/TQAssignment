package com.ArrayLogical;

import java.util.Scanner;

public class PrimeNumFromArray {

	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];

		for (int i = 0; i <= num.length; i++) {
			System.out.println("Enter the number at index" + " " + i);
			num[i] = sc.nextInt();
		}
		for (int i = 0; i <= num.length; i++) {
			if (true) {
				System.out.println(num[i]);
			}
		}

	}

}
