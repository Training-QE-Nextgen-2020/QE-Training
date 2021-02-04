package org.nextgen.pavani.javaquestions;

public class LeapYear {

	public static void main(String[] args) {
		int leapYear=2000;
		boolean leap=false;
		if(leapYear%4==0) {
			if(leapYear%100==0) {
				if(leapYear%400==0) {
					leap=true;
				}
				else {
					leap=false;
				}
				
			}
			else {
				leap=false;						
		}
	
		
	else {
		leap=false;
	}
		}
		if(leap) {
			System.out.println(""+is aleap year);
		}
		else {
			System.out.println(""+is not a leap year);
		}
		
}
}