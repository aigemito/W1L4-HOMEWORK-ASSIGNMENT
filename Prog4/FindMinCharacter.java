package Prog4;

import java.util.Scanner;

public class FindMinCharacter {

	public static void main(String[] args) {
	    String s = new String();
		System.out.print("Enter a word:  ");
				
		Scanner myInput = new Scanner(System.in);
		
		s=myInput.nextLine();
		
		
	    if(s.equals("")) {
	    	System.out.println("Please enter a text.");
	    }else {
	      System.out.println("You Entered: " + s);
		  System.out.println("Minimum character: " + minCharacter(s));
	    }
	    
	}
	
	public static char  minCharacter(String s){
		char c=s.charAt(0);
		if( s==""||s.length()==0){
			System.out.println("Empty Character ");
			System.exit(0);
		}
		if(s.length()==1) return c;
		else {
			
			if (c < minCharacter(s.substring(1))) return c;
			else return minCharacter(s.substring(1)); 
		 	
		}
		
			
	}

}

/*OUTPUT

Enter a word:  canada
You Entered: canada
Minimum character: a
 
*/