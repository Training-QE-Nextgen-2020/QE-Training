/**
 * 
 */
package org.nextgen.pavani.javaquestions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author pkoduru
 *
 */
public class ArrayListTraverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(1,5,66,43);
		Iterator it=l.iterator();
		while(it.hasNext()) {
			int numbers=(Integer)it.next();
		}
	}

}
