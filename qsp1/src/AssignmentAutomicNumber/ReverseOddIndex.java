package AssignmentAutomicNumber;

public class ReverseOddIndex {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6 };
		int n=a.length;
		for(int i=n-1;i>0;i--)
		{
			if(i%2==1)
			{
				System.out.println(a[i]+"\t");
			}
		}
	}

}
