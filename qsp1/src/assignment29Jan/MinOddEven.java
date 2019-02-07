package assignment29Jan;

public class MinOddEven {
	public static void main(String[] args) {

	int a[]= {10,20,5,30,58,10};
    int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(i%2==0)
		{
		  if(min>a[i])
		  {
			  min=a[i];
		  }
		}
	}
	
	System.out.println(min);
	}

}
