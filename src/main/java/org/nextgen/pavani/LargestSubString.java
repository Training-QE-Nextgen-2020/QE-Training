package org.nextgen.pavani;

public class LargestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abacdbebfda";
		String output = "";
		System.out.println("the given string is  " + input);
		
		for (int i = 0; i < input.length(); i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(input.charAt(i));
			for (int j = i; j < input.length(); j++) {
				if (i != j) {
					if (sb.toString().contains(input.substring(j, j + 1))) {
						break;
					} else {
						sb.append(input.substring(j, j + 1));
					}

				}
			}

			if (sb.toString().length() >= output.length()) {
				output = sb.toString();

			}
		}
		System.out.println("max substring is   :" + output);
	}

}
