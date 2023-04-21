/*Create arraylist of characters. Remove duplicate characters from 
the list. E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’} 
 Output should be {‘d’ , ‘g’ , ‘h’}*/
package com.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		ArrayList<Character> characters = new ArrayList<>();
		characters.add('d');
		characters.add('g');
		characters.add('h');
		characters.add('d');
		characters.add('d');
		characters.add('h');
		characters.add('g');

		System.out.println(characters);

		HashSet<Character> uniquecharacters = new HashSet<>(characters);

		// characters.clear();
		// characters.addAll(uniquecharacters);

		System.out.println(uniquecharacters);

	}

}
