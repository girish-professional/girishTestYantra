package assignment29Jan;

public class StringPalindrome {
public static void main(String[] args) {
	String given="rar";
	String reverse=isPalindrome(given);
	
	if(reverse.equals(given))
	{
		System.out.println("The Given String '"+given+"' is Palindrome");
	}
	else
	{
		System.out.println("Sorry: The Given String '"+given+"' is not a Palindrome");
	}
}
	
	
	public static String isPalindrome(String given)
	{
		char[] ch=given.toCharArray();
		StringBuilder s=new StringBuilder();
		for(int i=ch.length-1;i>=0;i--)
			s.append(ch[i]);
		return s.toString();
	}
}
