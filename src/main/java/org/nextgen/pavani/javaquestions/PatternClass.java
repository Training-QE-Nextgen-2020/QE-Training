package org.nextgen.pavani.javaquestions;

public class PatternClass {

	
//		1
//		1 2
//		1 2 3
//		1 2 3 4 
//		1 2 3 4 5 to print the above pattern 
	public static void main(String[] args) {
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
			System.out.print(y+" ");
			}
		System.out.println();
		}
	}	

}
