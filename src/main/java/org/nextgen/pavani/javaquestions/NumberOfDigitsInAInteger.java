package org.nextgen.pavani.javaquestions;

public class NumberOfDigitsInAInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=122442334; //12244-5 digits are there
		int count=0;
		while(num!=0) {//12244 ,1224
			num=num/10;//1224 ,122
			count++;
		}
		System.out.println("the no.of digits in a number==>"+count);

	}

}
