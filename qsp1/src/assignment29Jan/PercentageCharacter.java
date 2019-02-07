package assignment29Jan;

public class PercentageCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value="India is my country 100%";
		charPercentage(value);

	}
	public static void charPercentage(String input)
	{
		int Ucase=0;
		int Lcase=0;
		int D=0;
		int Sp=0;
		int totalChar=input.length();
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			if(Character.isUpperCase(c))
				Ucase++;
			else if(Character.isLowerCase(c))
				Lcase++;
			else if(Character.isDigit(c))
				D++;
			else
				Sp++;
		}
			System.out.println("Upper Case Percentage = "+Ucase*100/totalChar+"%");
			System.out.println("Lower Case Percentage = "+Lcase*100/totalChar+"%");
			System.out.println("No of DIGITS Percentage = "+D*100/totalChar+"%");
			System.out.println("Upper Case Percentage = "+Sp*100/totalChar+"%");
		
		
	}

}
