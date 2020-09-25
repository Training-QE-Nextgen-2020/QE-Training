package org.nextgen.algorithms;

public class StringReverse {

	/*
	 *  Write a program to reverse a given string
	 *  
	 *   input = "Java Interview Session"
	 *   output "";  
	 *  
	*/
	public static void main(String args[]) {
		
		
				
		String input = "Java Interview Question";
		//initialisation ; conditon;           increment or decrement
		
		String output ="";
		for(int index=input.length() -1; index>=0; index--) {
		
			output = output + input.charAt(index);
			
		}
		
		
		
		
		
	}
}
