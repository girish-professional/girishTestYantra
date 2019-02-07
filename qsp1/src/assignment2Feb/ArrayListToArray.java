package assignment2Feb;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("how");
		list.add("are");
		list.add("You");
		
		Object[] toArray=list.toArray();
		
	   for(int i=0;i<toArray.length;i++)
	   {
		   System.out.println(toArray[i].toString());
	   }
	}
	
}
