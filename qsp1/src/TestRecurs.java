
public class TestRecurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Recursion(0);
	}
    public static void Recursion(int a)
    {
    	if(a==4)
    	{
    		return;
    	}
    	System.out.println(a);
    	a++;
    	Recursion(a);
    	System.out.println(a);
    }
}
