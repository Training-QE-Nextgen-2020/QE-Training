package org.nextgen.pavani.javaquestions;

public class AlphabetOrNot {

	public static void main(String[] args) {
		char c='@';
		if(c>='a' && c<='z' || c>='A'&&c<='Z') {
			System.out.println("the character is alphabet==>"+c);		
		}
		else {
			System.out.println("the character is not alphabet==>"+c);
		}

	}

}
