package com.ArrayLogical;

public class ReverseArray {

	public static void reverseArray(int[] arr) {

		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = (arr.length - 1); i >= 1; i--) {
			temp[j++] = arr[i];
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, };

	}

}
