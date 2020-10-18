package org.nextgen.algorithms;

public class BiiggestSubstring {
	/*
	 * Giver an string find the biggest substring which a non-repetitive characters
	 */
	public static void main(String args[]) {
		String input = "abcdefwekaghorghflk";
		
		String output = "";
		for(int i=0;i<input.length();i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(input.charAt(i));
			// a b ....
			for(int j=i;j<input.length();j++) {
				
				
				if(i!=j) {
					if(sb.toString().contains(input.substring(j, j+1))) {
						//We see a repetitive element
						break;
					} else {
						sb.append(input.substring(j, j+1));
					}
				}
			}
			
			if(sb.toString().length() > output.length()) {
				output = sb.toString();
			}
			
		}
		
		System.out.println("Max substring is:" + output);
		
		
	}
	
	

}
