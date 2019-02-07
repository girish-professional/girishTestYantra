package assignment2Feb;

import java.util.Collections;
import java.util.LinkedList;

public class SublistFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("Hi");						//upto 11
		list.add("Hello");
		list.add("how");
		list.add("are");
		list.add("You");
		System.out.println(list);
		System.out.println(list.subList(1, list.size()-1));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		Collections.reverse(list);;
		System.out.println(list);

	}

}
