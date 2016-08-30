import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		// TODO Write this code. You will have a loop and call translateWord from here.
		Scanner sc = new Scanner(System.in);
		  System.out.println("Welcome to the Pig Latin Translator!");
		  String choice;
		  do
		  {
		   System.out.println("Enter a line to be translated");
		   String englishWord = sc.next();
		   String piglatinWord = translateWord(englishWord );
		   System.out.println(piglatinWord);
		   System.out.println("Translate another line?(y/n)");
		   choice = sc.next();
		   
		  } while (choice.equals("y"));	
		  System.out.println("Bye");
		  sc.close();
	}

	/**
	 * This method takes any single English word and translates it to a Pig Latin word.
	 */
	public static String translateWord(String englishWord) {
		String latinWord = englishWord.toLowerCase();
	
		char v = latinWord.charAt(0);
		if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
		{
			latinWord = latinWord.concat("way");
		}
		else{
		char firstLetter = latinWord.charAt(0); //get the first letter
		latinWord = latinWord.substring(1); //remove the first letter from the input string
		latinWord = latinWord + firstLetter + "ay"; //add first letter and "ay" to end of input string
		}
        return latinWord;
	}
}
	
	









