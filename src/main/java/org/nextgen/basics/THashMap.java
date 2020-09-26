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
		
		//one and only one key can be null
		productMap.put(null,  1212);
		
		//any number of values can be null
		productMap.put(1222,null);
		productMap.put(1223,null);
		productMap.put(1224,null);
		
		
		
		//print all the keys and values without travesing
		System.out.println("all the keys and values:" + productMap.toString());
		
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
