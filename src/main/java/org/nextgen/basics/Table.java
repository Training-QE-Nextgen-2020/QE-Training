package org.nextgen.basics;


/*
 * defualt constructors are created at compile time and inserted in to CLASS file and not in source file
 */
public class Table {

	int height; 
	
	//defualt constructor
	public  Table() {
		this(12);		
		System.out.println("from default consturctor");	
		
	}
	
	public  Table(int a) {
		this("test");
		System.out.println("parametirized constructor with int arg :" + a);	
	}
	
	public Table(String x) {
		System.out.println("parametirized constructor with string arg:" + x);
	}


	public static void main(String args[]) {
		
		Table myTable = new Table();
		System.out.println(myTable.height);
	}
}


