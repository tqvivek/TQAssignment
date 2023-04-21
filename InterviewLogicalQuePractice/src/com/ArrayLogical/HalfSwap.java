package com.ArrayLogical;

public class HalfSwap {

	public static void halfSwap(int[] arr) {
		int j = (arr.length / 2);
		int temp;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}

	}

	public static void halfSwap2(int arr[]) {

		int temp;

		for (int i = 0, j = (arr.length / 2); i < arr.length / 2; i++, j++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}

	}

	public static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		halfSwap(arr);

		printArray(arr);

		System.out.println();

	}

}
