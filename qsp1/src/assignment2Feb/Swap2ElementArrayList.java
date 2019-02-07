package assignment2Feb;

import java.util.ArrayList;
import java.util.Collections;

public class Swap2ElementArrayList {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("how");
		list.add("are");
		list.add("You");
		System.out.println(list);
		swap(0,1,list);
		System.out.println(list);
         
		
		
		
	}
	public static ArrayList<String> swap(int index1,int index2,ArrayList<String> al)
	{
          
          Collections.swap(al, index1, index2);
          return al;
	}

}
