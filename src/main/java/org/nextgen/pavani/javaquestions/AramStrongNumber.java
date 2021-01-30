package org.nextgen.pavani.javaquestions;

public class AramStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int actualNum=num;
		double result=0;
		while(actualNum!=0) { //153
			int reminder=actualNum%10;//0+3
			result=result+Math.pow(reminder, 3);
			num=num/10;	//15	
			
		}

	}

}
