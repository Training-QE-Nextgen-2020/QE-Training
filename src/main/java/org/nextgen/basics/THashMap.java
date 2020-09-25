package org.nextgen.basics;

import java.util.HashMap;

public class THashMap {

	public static void main(String args[]) {
		HashMap<Integer, Integer> productMap = new HashMap<Integer, Integer>();
		
		productMap.put(123, 998);
		productMap.put(124, 997);
		productMap.put(125, 996);
		productMap.put(126, 995);
		productMap.put(127, 994);
		productMap.put(128, 998);
		
		
		//traversing thru
		for(Integer key : productMap.keySet()) {
			System.out.println("Keys:" + key);
			System.out.println("Value:" +productMap.get(key));
		}
		
		
		//random
		System.out.println("acessing randomly:" + productMap.get(127));
		
		
		HashMap<String, Integer> nameAgeMap = new HashMap<String, Integer>();
		nameAgeMap.put("Baljeet", 25);
		nameAgeMap.put("Sudeepth", 28);
		
		for(String key:nameAgeMap.keySet()) {
			System.out.println(key + ":" + nameAgeMap.get(key));
		}
		
		
	}
}
