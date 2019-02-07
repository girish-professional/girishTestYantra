package assignment2Feb;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArray  {
	public static void main(String[] args) {
		   LinkedList<String> list=new LinkedList<String>();
		
			list.add("Hi");
			list.add("Hello");
			list.add("how");
			list.add("are");
			list.add("You");
			Object[] arrays= list.toArray();
			for(Object ob:arrays)
			{
				System.out.println(ob.toString());
			}
			
			
	}

}
