package org.nextgen.pavani.javaquestions;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int rev=0;//321 
		int temp=num;
		while(temp!=0) {
			temp=temp%10;//modules gives the remoinder 123/10=remider will be 3
			rev=(rev*10)+temp;//0+3
			temp=temp/10;//12
		}
		
		System.out.println("the revese number"+rev);
	}

}
