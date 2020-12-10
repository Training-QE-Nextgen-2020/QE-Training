package org.nextgen.baljeet;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "Welcome to Google!";
		
		// Loop Increment or Decrement
		
		String output="";
		
		for (int index=input.length()-1; index>=0; index--) {
			
			output = output + input.charAt(index);
		}
		
		System.out.println(output);
	}

}
