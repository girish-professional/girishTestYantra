package assignment29Jan;

public class EvenIndex {
	public static void main(String[] args) {
		
	int sum=0;
	int a[]= {10,20,5,30,58,10};
	for(int i=0;i<a.length;i++)
	{
		if(i%2==0)
		{
			sum=sum+a[i];
		}
	}
	System.out.println(sum);
	}

}
