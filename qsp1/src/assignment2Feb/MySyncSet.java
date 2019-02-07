package assignment2Feb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MySyncSet {
	
	public static void main(String a[]){
		
		Set<String> ss = new HashSet<String>();
		Set<String> sysSet = Collections.synchronizedSet(ss);
		System.out.println("Synchronized set got created...");
	}
}