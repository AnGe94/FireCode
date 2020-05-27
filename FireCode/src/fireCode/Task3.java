package fireCode;

import java.util.*;

/*
  Write a method that takes in an input String and returns true if all the characters in the String are 
  unique and false if there is even a single repeated character.
  The method should return true if the input is null or empty String.

Examples:
areAllCharactersUnique("abcde") -> true


areAllCharactersUnique("aa") -> false


areAllCharactersUnique("") -> true


areAllCharactersUnique(null) -> true
 */

public class Task3 {

	static boolean duplicateChar(String word) {

		boolean check = false;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		
	// word.equals(null); -> poredi vrednosti stringa
	// String.isNull(word); -> moze i ovako
		
		if (word == null || word.isEmpty()) {
			check = true;

		}

		else {

			for (char c : word.toCharArray()) {

				if (map.containsKey(c)) {

					map.replace(c, map.get(c) + 1);
				} else
					map.put(c, 1);
			}

			for (char c : word.toCharArray()) {

				if (map.get(c) != 1) {
					check = false;
					break;
				} else
					check = true;
			}
		}
		return check;
	}

	public static void main(String[] args) {

		String s1 = "Not unique";  //false
		String s2 = "";				//true
		String s3 = "abcdef";		//true
		String s4 = "A";			//true
		String s5 = null;			//true

		System.out.println(Task3.duplicateChar(s5));

	}

}
