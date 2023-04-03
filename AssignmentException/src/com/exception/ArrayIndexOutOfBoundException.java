package com.exception;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		try {
			int arr[] = new int[2];
			System.out.println("Access element 3:" + arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception is thrown :" + e);
		}

	}

}
