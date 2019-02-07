package assignment29Jan;

import java.util.Arrays;

public class StringAnnagram {
	public static void main(String[] args) {
		
		String v1="keep";
		String v2="peek";
		if(isAnnagram(v1,v2))
			System.out.println(" Given two string "+v1+" and "+v2+" are annagram");
		else
			System.out.println(" Given two string "+v1+" and "+v2+" are  not annagram");
			
	}
	public static boolean isAnnagram(String value1,String value2)
	{
		char[] s1=value1.toLowerCase().toCharArray();
		char[] s2=value2.toLowerCase().toCharArray();
		if(s1.length!=s2.length)
		{
			return false;
		}
		else
		{
			Arrays.sort(s1);
			Arrays.sort(s2);
			return Arrays.equals(s1, s2);
		}
	 
		
	}

}
