package org.nextgen.pavani.javaquestions;

public class RemoveUnwantedCharactersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="@@1$#^%$&pavan**&^%^%";
		
		//wec can replace the unwanted charcaters with the regular expression 
		//reg expression[a-zA-Z0-9
		s=s.replaceAll("[^a-zA-Z0-9]", "");//have to store the value s.replaceAll in s only as string is immutable
		System.out.println("the string without unwanted charactes  ===>>  "+s);
	};

}
