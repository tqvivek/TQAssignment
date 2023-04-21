package com.ArrayLogical;

public class ShiftingNegativeAtEnd {

	public static void shiftNegative(int[] arr) {

		int left = 0;
		int right = arr.length;

		while (left < right) {
			while (left < right && arr[left] >= 0) {
				left++;
			}

			while (left < right && arr[right] < 0) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, -1, 2, -2, 3, -3, 4, -4 };

		shiftNegative(arr);

	}

}
