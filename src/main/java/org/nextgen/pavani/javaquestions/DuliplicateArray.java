/**
 * 
 */
package org.nextgen.pavani.javaquestions;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pkoduru
 *
 */
public class DuliplicateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"c", "java","c","javascript","php","java"};
		
		//by using for loop
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("duplicate elements are"+names[i]);
				}
			}
		}
		//by using hashset  as set stores unique values
		
		Set<String> store=new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("duplicate elements are"+store);
			}
			
		}

	}

}
