package org.nextgen.pavani.javaquestions;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// 0, 1,1,2,3,5,8,13
		int maxnum=10;
		int prnum=0;
		int nextnum=1;
		for(int i=0;i<=maxnum;i++) {
			System.out.println(prnum);//0,1,1,2,3
			int sum=prnum+nextnum;//1
			prnum=nextnum; //1
			nextnum=sum;//1		
		}
	}

}
