package com.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();

		int t1 = num;
		int length = 0;

		while (t1 != 0) {

			length = length + 1;
			t1 = t1 / 10;
		}
		int t2 = num;
		int arm = 0;
		while (t2 != 0) {
			int mult = 1;
			int rem = t2 % 10;
			for (int i = 1; i <= length; i++) {
				mult = mult * rem;
			}
			arm = arm + mult;
			t2 = t2 / 10;
		}
		if (arm == num) {
			System.out.println(num + "is armstrong number");
		} else
			System.out.println(num + " is not armstrong number");

	}

}
