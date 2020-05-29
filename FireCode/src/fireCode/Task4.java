package fireCode;


/*
A palindrome is a string or sequence of characters that reads the same backward as forward. For example, "madam" is a palindrome. 
Write a method that takes in a String and returns a boolean -> true if the input String is a palindrome and false if it is not. 
An empty string and a null input are considered palindromes. You also need to account for the space character. For example, "race car" 
should return false as read backward it is "rac ecar".

*/

public class Task4 {

	public static boolean isNanogram(String word) {

		boolean result = false;

		if (word == null || word.isEmpty())
			result = true;

		char[] charArray = word.toCharArray();

		for (int x = 0; x < charArray.length / 2; x++) {

			int y = charArray.length - 1 - x;

			char temp = charArray[y];
			charArray[y] = charArray[x];
			charArray[x] = temp;
		}

		String word2 = String.valueOf(charArray);

		if (word.contentEquals(word2))
			result = true;

		return result;
	}

	public static void main(String[] args) {

		String s1 = "";
		String s2 = null;
		String s3 = "Aleksandar";
		String s4 = "aca";

		System.out.println(Task4.isNanogram(s3));
	}

}
