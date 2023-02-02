package com.example;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Area of circle:");
		System.out.println("2.Area of Rectangle:");
		System.out.println("3.Area of triangle:");
		System.out.println("4.Area of Square:");

		System.out.println("Enter your choice:");
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			System.out.println("Enter the radius:");
			float radius = sc.nextFloat();
			double areaC = 3.14 * radius * radius;
			System.out.println("Area of circle:" + areaC);
			break;

		case 2:
			System.out.println("Enter the length:");
			int l = sc.nextInt();
			System.out.println("Enter thebreadth:");
			int b = sc.nextInt();
			// logic:
			int areaR = l * b;
			System.out.println("Area of Rectangle:" + areaR);
			break;

		case 3:
			System.out.println("Enter base and height:");
			int base = sc.nextInt();
			int height = sc.nextInt();
			// logic:
			double areaT = 0.5 * base * height;
			System.out.println("Area of Triangle:" + areaT);
			break;

		case 4:
			System.out.println("Enter the side:");
			int s = sc.nextInt();
			// logic:
			int areaS = s * s;
			System.out.println("Area of Square:" + areaS);
			break;

		default:
			System.out.println("Invalid input....");

		}

	}

}
