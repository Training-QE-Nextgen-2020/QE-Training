package org.nextgen.pavani.javaquestions;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int rev=0;
		int temp=num;
		while(temp!=0) {
			int rem=temp%10;//3 ,2,,1
			 rev=(rev * 10)+rem;//3
			temp=temp/10;
		}
		System.out.println(rev);

	}

}
