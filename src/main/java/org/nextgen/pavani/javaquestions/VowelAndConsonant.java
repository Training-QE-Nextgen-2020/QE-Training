package org.nextgen.pavani.javaquestions;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the alphabet");
		char c=reader.next().charAt(0);
		if(c=='a' || c=='e'|| c=='i'||c=='o'||c=='u') {
			System.out.println("the alphabet is vowel==>"+c);
			
		}
		else 
			System.out.println("the alphabet is consonanat==>"+ c);
		
		switch(c) {
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println("the alphabet is vowel"+c);
			break;
		default:
			System.out.println("the alphabet is consonant"+c);
			break;
			
		
		}

	}

}
