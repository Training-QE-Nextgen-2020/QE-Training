package org.nextgen.algorithms;

public class Palindromes {
	
	
	/*
	 * Given a string find out whether it is a palindrome or not
	 */
	public static void main(String args[]) {
		
		String input = "ABCD";
		
		
		
		StringBuilder builder = new StringBuilder();
		for (int counter=input.length()-1;counter>=0;counter--) {
			builder.append(input.charAt(counter));			
		}
		
		String reverseString = builder.toString();
		
		if(input.equals(reverseString)) {     // if(input == reverseString)
			System.out.println("Given string is a Palindrome");
		} else {
			System.out.println("Given string is not a Palindrome");
		}
		
		
	}
	
	
	//one more effective way of doing palindrome algorithm  -- challenge

}
