package org.nextgen.pavani.javaquestions;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="madam";
		String output="";
		int length=input.length();
		System.out.println("the length of a sting is"+length);
		StringBuilder buider=new StringBuilder();
		for(int i=input.length()-1;i>=0;i--) {
			buider.append(input.charAt(i));
		}
		System.out.println("the reverse string is"+buider.toString());
		if(input.equals(buider.toString())){
			System.out.println("the given string is palindrome");
		}
		else {
			System.out.println("the given string is not palindrome");
		}
			
	}

}