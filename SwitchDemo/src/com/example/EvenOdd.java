/*********2.Write a Java program to check whether a number is even or odd 
using switch case*********/
package com.example;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Enter a positive integer number: ");
		num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println(num + "is an EVEN number");
			break;

		case 1:
			System.out.printf(num + "is an ODD number");
			break;
		}

	}

}
