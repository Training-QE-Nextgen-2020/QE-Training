package org.nextgen.basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TSet {
	
	
	
	public static void main(String args[]) {
		
		System.out.println("===================================HASH SET ==============================");
		Set<Integer> ageSet = new HashSet<Integer>();
		ageSet.add(null);
		ageSet.add(12);
		ageSet.add(13);
		ageSet.add(14);
		ageSet.add(13);  // 13 is a duplicate and will be removed
		
		System.out.println(ageSet.size());
		
		//simple
		for(Integer age : ageSet) {
			System.out.println(age);
		}
		
		Iterator<Integer> iterator = ageSet.iterator();
		while(iterator.hasNext()) {
			System.out.println("Iterator next value:" + iterator.next());
		}
		
		
		System.out.println("===================================TREE SET ==============================");
		//Example for an arrar wheer you need unique numbers and in an order
		Set<Integer> sampleSet = new TreeSet<Integer>();
		sampleSet.add(1);
		sampleSet.add(2);
		sampleSet.add(2);
		sampleSet.add(3);
		sampleSet.add(8);
		sampleSet.add(4);
		sampleSet.add(6);
		sampleSet.add(5);
		sampleSet.add(23);
		sampleSet.add(39);
		sampleSet.add(19);
		sampleSet.add(19);
		sampleSet.add(15);
		sampleSet.add(18);
		
		for(Integer each : sampleSet) {
			System.out.println(each);
		}
		
		
		
		System.out.println("===================================LINKED HASH SET ==============================");
		
		//Example for an arrar wheer you need unique numbers and preserve the insertion order
		Set<Integer> newSet = new LinkedHashSet<Integer>();
		newSet.add(1);
		newSet.add(2);
		newSet.add(2);
		newSet.add(3);
		newSet.add(8);
		newSet.add(4);
		newSet.add(6);
		newSet.add(5);
		newSet.add(23);
		newSet.add(39);
		newSet.add(19);
		newSet.add(19);
		newSet.add(15);
		newSet.add(18);
		
		for(Integer each : newSet) {
			System.out.println(each);
		}
		
	}

}
