package assignment29Jan;

public class Pattern3 {
	public static void main(String[] args) {
		int sp=3;
		int lines=4;
		int k=1;
		for(int i=0;i<lines;i++,sp--,k++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++)
			{
				
				if(j%2==0)
				System.out.print(k);
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}
