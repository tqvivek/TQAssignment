package com.ArrayLogical;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] sub = new float[7];

		for (int i = 0; i < 5; i++) {
			System.out.println(sub[i]);
			System.out.println("Enter marks of subject:");
			sub[i] = sc.nextFloat();

		}

	}

}
