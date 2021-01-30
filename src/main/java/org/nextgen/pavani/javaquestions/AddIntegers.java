package org.nextgen.pavani.javaquestions;

import java.util.Scanner;

public class AddIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num1=new Scanner(System.in);
		Scanner num2=new Scanner(System.in);
		System.out.println("enter the two numbers");
		
		//by using third or temporary variable
		int a=num1.nextInt();
		int b=num2.nextInt();
		int c=a+b;
		System.out.println("the addition of two numbers "+c);

	}

}
