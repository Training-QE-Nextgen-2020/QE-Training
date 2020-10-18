package org.nextgen.pavani;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 17;
		boolean flag = true;
		System.out.println("the given number is:  " + input);
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("the given number  "+ input +" is prime");
		}

		else
			System.out.println("the given number " + input + " is not prime");

	}

}
