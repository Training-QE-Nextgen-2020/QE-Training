package org.nextgen.pavani;
import java. util.Hashtable;
import java.util.Set;


public class THashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Hashtable<String ,Integer> stuDetails=new Hashtable<String,Integer>();
	stuDetails.put("Dan",1);
	stuDetails.put("Brad",2);
	stuDetails.put("Vasim",3);
	System.out.println(stuDetails);
	Set<String>key=stuDetails.keySet();
	for(String names:key) {
		System.out.println("the names of students are"+names+"roll numbers are"+stuDetails.get(names));
	}
	
	
	}
}