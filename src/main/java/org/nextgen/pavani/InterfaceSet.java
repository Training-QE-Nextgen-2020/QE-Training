package org.nextgen.pavani;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InterfaceSet {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numbers=new HashSet<Integer>();
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(14);
		numbers.add(12);
		numbers.add(16);
		numbers.add(15);
		System.out.println(numbers);
		System.out.println(numbers.size());
		
		System.out.println("does numbers contain 13 or not  "+numbers.contains(13));
		Iterator  value=numbers.iterator();
		System.out.println("the iterator values are");
		while(value.hasNext()) {
			System.out.println(value.next());
			
		}
		Set<String> names=new LinkedHashSet<String>();
		names.add("a");
		names.add("b");
		names.add("a");
		names.add("c");
		names.add("p");
		names.add("d");
		System.out.println(names);
		Iterator nameLinnk=names.iterator();
		while(nameLinnk.hasNext()) {
		
			System.out.println(nameLinnk.next());
		}
		Set<Float>salary=new TreeSet<Float>();
		salary.add((float) 123.4);
		salary.add((float) 356.98);
		salary.add((float) 789.98);
		salary.add((float) 111.98);
		salary.add((float) 234.98);
		salary.add((float) 111.98);
		System.out.println("salary in an ascending order"+salary);
		Iterator money=salary.iterator();
		while(money.hasNext()) {
			System.out.println(money.next());
		}
		
		
		
		
		
		
	}

}
