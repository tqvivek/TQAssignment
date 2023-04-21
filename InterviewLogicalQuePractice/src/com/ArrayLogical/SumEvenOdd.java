package com.ArrayLogical;

public class SumEvenOdd {

	public static int EvenSum(int[] arr) {
		int count = 0;
		int EvenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {

				EvenSum = EvenSum + arr[i];
				count++;
			}

		}
		System.out.println("Number of Even Num In An Array: " + count);
		System.out.println("Sum of Even Numbers From Array Is:" + EvenSum);

		return EvenSum;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println(arr.length);
		EvenSum(arr);

	}

}
