package org.nextgen.algorithms;

public class ReverseNumber {

	public static void main(String args[]) {
		
		//reverse a number given a number
		int input = 652387;
		
		int temp=input;
		
		int output = 0;
		
		//idea here is to make temp divided every time by 10
		while(temp!=0) {
			int reminder = temp % 10;  // 3 , 2, 1			
			output = (output * 10) + reminder;			
			temp = temp /10;  // 12 , 1 , 0
		}
		
		
		System.out.println("Reversed number :" + output);
		
		
	}
}
