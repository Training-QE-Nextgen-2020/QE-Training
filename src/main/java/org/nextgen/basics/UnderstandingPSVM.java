package org.nextgen.basics;

public class UnderstandingPSVM {

	
	public static void main(String args[]) {
		
		
		//System.out.println(sum(5, 6));
		
		
		//Call static method from Car class
		//Car.getColor();
		
		
		//Call Car method getCard to get an Car object
		Car  lucid = Car.getCar();
		
		
		System.out.println(lucid.make);
		
		System.out.println(lucid.model);
		System.out.println("Price:"+ lucid.price);
		
		
		
		//Creating another Car Object
		Car tesla = null;
		tesla = new Car();
		tesla.setPrice(35000);
		
		System.out.println(tesla.make);
		System.out.println("Price:" + tesla.getPrice());
		
		UnderstandingPSVM object = new UnderstandingPSVM();
		int a1 = object.addNumber(3, 5);
		//System.out.println(a1);
		
		
		Table myTable = new Table();
		
	}
	
	
	
	public static int sum(int i, int j) {
		int c = 0;
		c = i+j;
		return c;
		
	}
	
	
	//NON-STATIC method 
	public int addNumber(int a, int b) {
		String s = "some string";
		int c =0;
		c = a + b;
		
		return c;
	}
	
	// overriding the method
	public int addNumber(int a, int b, String z) {
		return 0;
	}
	
	
}
