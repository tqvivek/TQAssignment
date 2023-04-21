package com.StringLogical;

public class CountFrequency {

	public static void countFerq(String str) {
		str = str.toLowerCase();
		int count;
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			count = 1;

			if (ch[i] == ' ' || ch[i] == '\0')
				continue;

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			System.out.println(ch[i] + ":" + count);
		}

	}

	public static void main(String[] args) {

		String s1 = "Vivek Dasharath Dange";
		countFerq(s1);
	}

}
