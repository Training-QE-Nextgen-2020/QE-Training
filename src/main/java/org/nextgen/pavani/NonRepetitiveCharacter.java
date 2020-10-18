package org.nextgen.pavani;

public class NonRepetitiveCharacter {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdab";
		System.out.println("the given string is  " + str);
		for (int i = 0; i <= str.length()-1; i++) {
			boolean flag = true;
			for (int j = 0; j <= str.length()-1; j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("the first nonrepetitive character is  " + str.charAt(i));
			break;

		}
	}

}
