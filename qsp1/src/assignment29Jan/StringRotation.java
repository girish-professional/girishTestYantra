package assignment29Jan;

import java.util.Arrays;

public class StringRotation {
	public static void main(String[] args) {
		
	
	/*String orginal="IndiaVsAustralia";
	String rotated="AustraliaVsIndia";*/
		String orginal="IndiaVsEngland";
				String rotated="VsEnglandIndia";
	if(isRotateString(orginal,rotated))
		System.out.println(" Given two string "+orginal+" and "+rotated+" are rotated String");
		else
			System.out.println(" Given two string "+orginal+" and "+rotated+" are  not rotated String");
	
	
	}
	public static boolean isRotateString(String value1,String value2)
	{
		String orginalString=value1;
		String rotateString=value2;
		if(orginalString.length()!=rotateString.length())
		{
			return false;
		}
		else
		{
			String s3=orginalString+orginalString;
			if(s3.contains(rotateString))
				return true;
		}
		return false;
	 
		
	}


}
