package assignment2Feb;

import java.util.ArrayList;

public class ArrayListClone {
 public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Hi");
	list.add("Hello");
	list.add("how");
	list.add("are");
	list.add("You");
	System.out.println(list);
	ArrayList<String> list2=(ArrayList<String>) list.clone();
	System.out.println(list2);
	System.out.println(list2.equals(list));
	
	
	
}
	
}
