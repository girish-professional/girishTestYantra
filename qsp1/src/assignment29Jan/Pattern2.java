package assignment29Jan;

public class Pattern2 {
	public static void main(String[] args) {
		int sp=3;
		int lines=4;
		char ch='A';
		for(int i=0;i<lines;i++,sp--,ch=(char)(ch+2))
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
			
		}
	}

}
