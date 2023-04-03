package com.loops;

import java.util.Scanner;

public class AlternatePrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count = 1;
		int num = 2;

		while (count <= n) {
			boolean flag = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + "is not prime number");
					flag = false;
				}

			}
		}

	}

}
