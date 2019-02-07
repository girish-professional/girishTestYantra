package assignment2Feb;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayInArrayList {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("how");
		list.add("are");
		list.add("You");
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		

	}
}
