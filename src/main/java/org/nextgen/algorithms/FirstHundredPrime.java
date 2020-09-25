package org.nextgen.algorithms;

public class FirstHundredPrime {

	public static void main(String args[]) {
		
		FirstHundredPrime firstHundredPrime = new FirstHundredPrime();
		firstHundredPrime.generate();
	}
	
	// first 100  prime numbers
	public void generate() {
		
		int number = 2;
		int tally =0;
		boolean CONTINUE_LOOP = true;
		while(CONTINUE_LOOP) {
			boolean flag = true;			
			for(int counter=2; counter<=number/2; counter++ ) {
				
				if(number % counter == 0) {
					//it is not a prime number
					flag = false;
					break;					
				}
			}
			
			if(flag) {
				tally++;
				System.out.println("Prime number:" + number);
			}
			
			if(tally == 100) {
				CONTINUE_LOOP = false;
			}
			
			
			number++;
			
			
		}
		
		
		
	}
}


