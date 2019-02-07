package AssignmentAutomicNumber;

import java.util.Scanner;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String first="abc";
		String second="xyz";*/
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the first String ");
		String first=sc.next();
		System.out.println(" Enter the Second String ");
		String second=sc.next();
		swap(first,second);
	}
		public static void swap(String first,String second)
		{
	
			System.out.println(" Before Swap first="+first+" second="+second);
			first=first+second;
			second=first.substring(0,first.length()-second.length());
			first=first.substring(second.length());
			System.out.println(" After Swap first="+first+" second="+second);
		}
		
	

}
