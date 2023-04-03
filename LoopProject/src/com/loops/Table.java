package com.loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		System.out.println("---------------");
		System.out.println("Table of" + n);
		System.out.println("----------------");

		for (int i = 1; i <= 20; i++) {
			System.out.println(n + "X" + i + "=" + (n * i));
		}

	}

}
