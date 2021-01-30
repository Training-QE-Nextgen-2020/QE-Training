package org.nextgen.pavani;

public class SwapTwoIntegerNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		System.out.println("the value of x is"+x);
		System.out.println("the value of y is"+y);
		//by using temp or third variable
		int temp;
		temp=x; //10
		x=y;//x=20;
		y=temp;;
//		System.out.println("the value of x is"+x);
//		System.out.println("the value of y is"+y);
//		
		//by using + operator
		x=x+y;//30
		y=x-y;//10
		x=x-y;//20
//		System.out.println("the value of x is"+x);
//		System.out.println("the value of y is"+y);
		
		//by using * operator
		x=x*y;//200
		y=x/y;//10
		x=x/y;//20
//		System.out.println("the value of x is"+x);
//		System.out.println("the value of y is"+y);
		//by using ^ operator
		x=x^y;
		y=x^y;
		x=x^y;										
		System.out.println("the value of x is"+x);
		System.out.println("the value of y is"+y);
		


	}

}

