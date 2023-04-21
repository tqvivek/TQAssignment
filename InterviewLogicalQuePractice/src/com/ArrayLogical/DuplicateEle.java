package com.ArrayLogical;

public class DuplicateEle {

	public static void duplicate(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicates are:" + arr[j]);
				}

			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3, 4, 5, 3 };
		duplicate(arr);
	}

}
