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

	static boolean duplicateChar(String word) throws NullPointerException {

		boolean check = false;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		if (word.equals(null)) {
			check = true;
			
			throw new NullPointerException();

		} else if(word.isEmpty()) check = true;
		
		else  {

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

		try {
		String s1 = "Not unique";
		String s2 = "";
		String s3 = "abcdef";
		String s4 = "A";
		String s5 = null;

		System.out.println(Task3.duplicateChar(s2));
		}
		catch(NullPointerException npe) {
			
			System.out.println("true");
		}

	}

}
