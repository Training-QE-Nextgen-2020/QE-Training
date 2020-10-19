package org.nextgen.pavani;

public class LargestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="HarshikaisabaHarshika";
		String  pali="";
		boolean flag=true;
		System.out.println("the given name is "+name);
		for(int i=0;i<name.length()-1;i++) {
			for(int j=0;j<name.length()-1;j++) {
				if(i!=j && name.charAt(i)==name.charAt(j)) {
					pali=pali+name.charAt(i);
					System.out.println("the palindrome is"+pali);
					flag=false;
					break;
				}
				if(flag) {
					System.out.println("the given string is"+name.charAt(i));
				}
				
			}
		}

	}

}
