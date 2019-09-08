package Prog4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s= new String();
		System.out.print("Enter a word to check: ");
		Scanner myInput = new Scanner(System.in);
		
		s=myInput.nextLine();
		
		if(isPalindrome(s)) System.out.println(s +" is palindrome ");
		else System.out.println(s +" is not palindrome ");
			

	}

	static boolean isPalindrome(String word){
		
		//base 
		if (word=="" || word.length()<= 1 ) {
			return true;// Empty string is palindrome. Just a base condition 			
			
			}
		if (word.charAt(0)!=word.charAt(word.length()-1)) return false;   // check if the first character is the same as the last character
		else{
			return isPalindrome(word.substring(1, word.length()-1));  // Main recursive step 
		} 
		
	}
	
}

