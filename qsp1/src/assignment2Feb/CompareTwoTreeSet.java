package assignment2Feb;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.CollectionUtils;
public class CompareTwoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> list=new HashSet<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("how");
		list.add("are");
		list.add("You");
		list.add("Apple");
		list.add("Baby");
		
		Set<String> list2=new HashSet<String>();
		list2.add("Hi");
		list2.add("Hello");
		list2.add("how");
		list2.add("are");
		list2.add("You");
		list2.add("Apple");
		list2.add("Baby");
		
		  Collection<String> result = CollectionUtils.subtract(list,list2);
	        System.out.println(result);
	        if(result.isEmpty()){
	            System.out.println("perform Task-->>Value maches  ");

	        }else{
	            System.out.println("perform Task-->>Value not maches  ");
	        }
	     System.out.println(list);  
		 System.out.println(list2);
		 
		 
		
		
	}

}
