//WAP to print even numbers from 121 to 229 using do-while loop. 
package com.loops;

public class EvenNumberfrom121to229DoWhile {

	public static void main(String[] args) {

		int i = 121;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		} while (i <= 229);
		i++;

	}

}
