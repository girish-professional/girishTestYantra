package AssignmentAutomicNumber;

public class ReverseHalfArray {
    static void reverse(int []a, int n, int k) 
    { 
    	System.out.println(k);
        if (k > n) 
        { 
            System.out.println( "Invalid k");  
        } 
        for (int i = 0; i < k /2 ; i++) 
        { 
            int tempswap = a[i];  
                a[i] = a[k - i - 1];  
                a[k - i - 1] = tempswap;              
        }  
    }
    public static void main(String args[]) 
    { 
        int []a = {1, 2, 3, 4, 5, 6}; 
        int n = a.length, k = a.length/2;
        System.out.println(k);
        reverse(a, n, k);
        for (int i = 0; i < n; ++i) 
            System.out.print(a[i] + " "); 
    }
}
