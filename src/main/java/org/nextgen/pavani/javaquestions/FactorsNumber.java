package org.nextgen.pavani.javaquestions;

public class FactorsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int fact=1;
		while(num>=1){//5
			fact=fact*num;//1*5,5*4
			num--;
		}
		System.out.println("the factorial of a number "+fact);
	}

}
