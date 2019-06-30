// Author: Edna Jaqueline Zablah

package capstone1PigLatin;
import java.util.*;


public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String userInput;
		String userContinue;

		System.out.println("Welcome to Pig Latin Translator!");

		do {
			System.out.print("Enter a line to be translated: ");
			userInput = scnr.nextLine();

			// Extended Challenge Splits the string into an array of words
			String[] word = userInput.split(" "); 
			String output = "";
			
			try{
				for (int i = 0; i < word.length; i++) {
					String pigLatinWord = translateWord(word[i]); // Translates each word individually
					output += pigLatinWord + " "; // Joins the translated word back into the output
				}

				System.out.println("Translation: " + output);
				System.out.println();
			}
			//Extended Challenge check that the user has entered text 
			//Extended Challenge don't translate if start with numbers
			catch(StringIndexOutOfBoundsException e){ 
					System.out.println("Please enter a sentence without numbers");
			}
			
			System.out.println("Translate another line? (y/n):" );
			userContinue = scnr.next();
			scnr.nextLine();
		}
		while(userContinue.equals("y") || userContinue.equals("Y"));
		System.out.println("Thank you for using this translator!");
		scnr.close();

	}


	public static String translateWord(String word) {
		String lowerCaseWord = word.toLowerCase();
		int pos = -1; // Position of first vowel
		char vowel;

		// find the index of the first vowel in the word
		for (int i = 0; i < lowerCaseWord.length(); i++) {
			vowel = lowerCaseWord.charAt(i);

			if (isVowel(vowel)) {
				pos = i;
				break;
			}
		}

		if (pos == 0) {
			// Translating word if the first character is a vowel. 
			return lowerCaseWord + "way"; 
		} else {
			// Translating word if the first character(s) are consonants. 
			String a = lowerCaseWord.substring(pos); // Extracting all characters in the word beginning from the 1st vowel
			String b = lowerCaseWord.substring(0, pos); // Extracting all characters located before the first vowel
			return a + b + "ay"; // Adding "ay" at the end of the extracted words after joining them.
		}
	}


	public static Boolean isVowel(char vowel) {
		if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' || vowel == 'y') {
			return true;
		}
		return false;
	}
}




