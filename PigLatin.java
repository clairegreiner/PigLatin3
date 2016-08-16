package pigLatin;

import java.util.Scanner;

public class PigLatin {

	/*
	 * POST-MORTEM:
	 * 
	 * With help, cleared up variable definitions and was pointed to the" 1, word.length which helped immensely" 


	 * 
	 */

	boolean continueGame = false;
	String userGuess = null;
	private static final String String = null;

	public static void main(String[] args) {
		

		String realWord;//old variables. I'm a bit of a pack-rat. I can't let them go yet!!
		char pigHead; // for first letter validation
		String pigHeadless = null; // for word-minus-first-letter
		String ay = "ay"; //for truncated consonant-word
		String hay = "hay"; 
		String pigTranslation; // final output
		
		do {

			continueGame = false;

			System.out.println("Would you like to play a game?");
			String userToPlayGame = sc.nextLine();

			continueGame = Utils.userYesOrNo(userToPlayGame);

			if (userToPlayGame.equalsIgnoreCase("Yes")) {
				System.out.println("Cool lets guess my number");
		
																			// do-while
		System.out.println("Welcome to the Pig Latin Translator. Please enter a word:"); // wooo!
		Scanner sc = new Scanner(System.in); // computer takes in keyboard input		// works
		String word = sc.nextLine(); // method to run									// this
		System.out.println(word); // displays what was entered  --	
		
		char firstLetter = word.charAt(0); //initial word
		String hyphen = " -"; //might be needed for 2-letter combo validation later
		boolean isVowel = theFirstLetterIsAVowel(firstLetter);
		 if (!isVowel){  //route to vowel-hay
			 pigHeadless = word.substring(1, word.length()); //grabs everything after 1st letter
			  pigTranslation =pigHeadless +hyphen+firstLetter+ay;  //displays correctly.
			 
		 }else {//vowel
			 pigTranslation = word +hyphen+hay;  //displays correct hyphenation
		 
		 }
		 System.out.println(pigTranslation);
}//main
	
		
	
		
	//below - credit to the Big Group in the Back/Mary
	public static boolean theFirstLetterIsAVowel(char firstLetter)
    { 
        char[] vowel = {'a', 'e','i','o','u'};
        boolean isThisAVowel = false;
        for (int i = 0; i < vowel.length; i++) 
        
        {
            if (firstLetter == vowel[i])
            {
                isThisAVowel = true;
            }
        }
        return isThisAVowel;        
    
	}}

	// complete the translate; maybe validate isLetter

	//public static String  (char pigHead, String pigHeadless ) { review static later
		//return (pigHeadless + pigHead + "-ay"+);		
		
	

	// complete the translate; maybe validate isLetter

	// realWord = typeWord(); // the word typed in

	// CHeck if starts with vowel

	// then change word
	// add yay to vowels
	// change and at yay to cons

	// translation = firstLetter(realWord); // get first character of word

	// result(translation); //the final concatenated mess

	

	
	

// the unchanged vowel-word

// if isVowel = true; //go to pigHeadless and "yay" logic

// else //go to consonant logic

// if- else: ifStringBuilder modUserInput = new StringBuilder(userInput);
/*
 * char firstLetter= modUserInput.charAt(0); System.out.println(firstLetter);
 * 
 * modUserInput.deleteCharAt(0); System.out.println(modUserInput);
 * modUserInput.insert(0, 'x'); System.out.println(modUserInput); char[] hi =
 * {'h', 'i', '_'}; modUserInput.insert(0, hi); modUserInput.append(hi); //
 * vowel = true; else the full process
 * 
 */
