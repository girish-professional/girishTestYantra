package assignment29Jan;

public class Pattern1 {
public static void main(String[] args) {
	

	int sp=3;
	int lines=4;
    int k;
   
	for(int i=0;i<lines;i++,sp--)
	{
		for(int j=0;j<sp;j++)
		{
			System.out.print(" ");
			
		}
		 k=i+1;
		for(int j=0;j<(i*2+1);j++)
		{
			     if(j<(i*2+1)/2)
				 System.out.print(k--);
			     else
			    	 System.out.print(k++);
		
		}
		System.out.println();
		
	}
}	
}
