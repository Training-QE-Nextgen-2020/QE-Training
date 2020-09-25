package org.nextgen.algorithms;

public class NonReaptingCharacter {
	
	public static void main(String args[]) {
		
		String s = "ffiirrfsstt";
		
		for(int i=0;i<=s.length() -1; i++) {
			boolean unique = true;
			for(int j=0;j<=s.length() -1; j++) {				
				
				
				/*
				 * If index is not same and values are equal that is repeating
				 * break inner loop and move on to outer loop
				 */
				if(i!=j  && s.charAt(i) == s.charAt(j) ) {
					unique = false;
					break;			
				}					
				
			}
			
		
			if(unique) {
				System.out.println(s.charAt(i));
				break;
			}
				
			
			
		}
		
		
	}

}
