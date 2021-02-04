package org.nextgen.pavani.javaquestions;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="malayalam";
		StringBuilder builder=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			builder.append(str.charAt(i));
		}
	System.out.println("the string reverse is"+builder.toString());

	
	if(builder.toString().equals(str)) {
		System.out.println("the given string is palindrome");
	}
	else
	{
		System.out.println("the given string is not palindrome");
	}
		
	}

}
