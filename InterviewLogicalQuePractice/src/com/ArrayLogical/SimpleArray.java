package com.ArrayLogical;

public class SimpleArray {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[20];

		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;
		arr[10] = 80;

		System.out.println(arr);

		for (int i = 0; i <= 10; i++) {
			System.out.println(arr[i]);
		}

	}

}
