package org.nextgen.pavani;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hello";
		String b="world";
		System.out.println("the string a is: "+a);
		System.out.println("the string b is: "+b);
		a=a+b;//helloworld
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
	
		System.out.println("the string a is: "+a);
		System.out.println("the string b is: "+b);

	}

}
