package org.nextgen.basics;

public class Arrays {

	public static void main(String args[]) {
		
		int listOfMonths[] = {1,2,3,4,5,6,7,8,9,10,11,12};
	
		//Simple form to loop thru array collection
		for(int thisMonth  : listOfMonths) {
			System.out.println(thisMonth);
			
		}
		
		System.out.println(listOfMonths.length);
		
		//old style to loop thru array collection and get each item
		for(int index =0; index < listOfMonths.length; index++) {
			
			System.out.println(listOfMonths[index]);
		}
		
		System.out.println(listOfMonths[2]);
		
		String listOfDays[] = {"Sunday","Monday", "Tuesday"};
		for(String day : listOfDays) {
			System.out.println(day);
		}
		
		
		//multi - dimensional array
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		String c[] = {};
		
		int multiDimensionalArray[][] = {a,b};
		for(int[] thisArray : multiDimensionalArray) {
			
			//looping thru each Array like a ,b
			for(int eachArrayItem : thisArray) {
				System.out.println("Element:" + eachArrayItem);
			}
		}
		
		
		
		//CAn store all data types in array
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		Car carArrays[] = {c1,c2,c3};
		
		
	}
}
