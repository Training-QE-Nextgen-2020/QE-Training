package org.nextgen.pavani;

import java.util.ArrayList;
import java.util.List;

public class LargetSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr = "abcdabcef";
		boolean appendString = false;
		List<String> resultList = new ArrayList<String>();
		String resultStr = new String();
		// 1. Loop thru all and find non-repeated substrings & add into list
		for (int i = 0; i < inputStr.length() - 1; i++) {
			resultStr = Character.toString(inputStr.charAt(i));
			appendString = true;
			for (int j = i + 1; j < inputStr.length() - 1; j++) {
				if (!resultStr.contains(Character.toString(inputStr.charAt(j)))) {
					resultStr = resultStr + (inputStr.charAt(j));
				} else {
					resultList.add(resultStr);
					appendString = false;
					break;
				}
			}
		}
		
		
		//2. Loop thru result list and find no.of characters and print the biggest one
		int resultLength = 0;
		String finalResultStr = null;
		for (String result : resultList) {
			if (result.length() > resultLength) {
				resultLength = result.length();
				finalResultStr = result;
			}
			//System.out.println(result + " : " + result.length());  
		}
		
		
		System.out.println(finalResultStr + " : " +resultLength);
		
	}

}
