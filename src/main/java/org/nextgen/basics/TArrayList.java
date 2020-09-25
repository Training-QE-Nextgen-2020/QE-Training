package org.nextgen.basics;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class TArrayList {
	public static void main(String args[]) {
		int ages[] = {1,2,3};
		
		
		//int -->  Integer wrapper class for int
		ArrayList<Integer> priceList = new ArrayList<Integer>();
		priceList.add(1);
		priceList.add(12);
		priceList.add(13);
		priceList.add(14);
		
		for(Integer price : priceList) {
			System.out.println(price);
		}
		
		System.out.println("size:" + priceList.size());
		
		priceList.remove(1);
		
		for(Integer price : priceList) {
			System.out.println(price);
		}
		System.out.println("size:" + priceList.size());
		
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		//stack.pop();
		stack.get(0);

		//cannot use primitives only objects
		//ArrayList<int> list = new ArrayList();
		
	}
}
