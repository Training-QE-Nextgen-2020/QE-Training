package org.nextgen.algorithms;

public class PrimeOrNot {

	public static void main(String args[]) {
		
		int num = 27;
		boolean flag = true;
		
		
		for (int index=2; index<=num/2; index++ ) {
			
			if(num % index == 0) {
				flag = false;
				break;
				
			}
		}
		
		if(flag) {
			System.out.println("Given num is a prime number : " + num);
		} else {
			System.out.println("Given num is not a prime number : " + num);
		}
		
	}
}
