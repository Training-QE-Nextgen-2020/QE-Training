package org.nextgen.algorithms;

public class BiggestPalindrome {

	public static void main(String args[]) {
		
		String input = "red kayak is owned by ana and her dad";
		String palindrome = "";
		
		int start =0;
		int end = 0;
		
		for(int index=0;index<input.length();index++) {
			int oddLength = expandFromMiddle(input, index, index);
			int evenLength = expandFromMiddle(input, index, index+1);
			int maxLength = Math.max(oddLength, evenLength);
			//overiwte start and end only if new lenght is maximum from already known palindrome
			if(maxLength > end - start) {
				start = index - ((maxLength-1)/2);
				end =  index + ((maxLength)/2);  
				
			}
			
			palindrome = input.substring(start, end + 1);
				
			
		}
		
		System.out.println(palindrome);
		
		
		
	}
	
	public static int expandFromMiddle(String input, int left, int right) {
		
		
		while(left>=0 && right <input.length() && input.charAt(left) == input.charAt(right) ) {
			left--;
			right++;		
			
		}
		
		return right - left - 1;	  	
	}

	
}
