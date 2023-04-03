package com.exception;

public class TwoException {

	public static void main(String[] args) {
		try {
			int arr[] = new int[3];
			System.out.println(arr[4]);
			try {
				String str = "My String";
				System.out.println(str.charAt(9));
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
