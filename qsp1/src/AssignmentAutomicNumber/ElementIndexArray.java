package AssignmentAutomicNumber;

public class ElementIndexArray {
	
	public static void main(String[] args) {
		
	
	String s[]= {"girish","prema","savita","poonam"};
	
	String index="prema";
	
	for(int i=0;i<s.length;i++)
	{
		if(s[i].equals(index))
		{
			System.out.println(index+" for index "+i);
		}
	}

	}
}
