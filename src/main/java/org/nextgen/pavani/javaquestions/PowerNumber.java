package org.nextgen.pavani.javaquestions;

public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=2;
		int exponent=1;//2^4=2*2*2*2=16
		int result=1;
		while(exponent!=0) {
			result=result*base;
			--exponent;
		}
		System.out.println("the exponent value is ==>   "+result);
		
	}

}
