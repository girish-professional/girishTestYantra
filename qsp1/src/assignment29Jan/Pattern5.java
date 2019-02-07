package assignment29Jan;

public class Pattern5 {
	public static void main(String[] args) {	
	int lines=5;
	int k=5;
	
	for(int i=0;i<lines;i++,k--)
	{
		for(int j=0;j<lines;j++)
		{
			if(i==j|| (i+j)==lines-1)
			{
				System.out.print(k);
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
 }
}
