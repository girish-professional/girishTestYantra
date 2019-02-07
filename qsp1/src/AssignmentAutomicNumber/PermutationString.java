package AssignmentAutomicNumber;

import java.util.Scanner;

public class PermutationString {
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String str = sc.next() ; 
	        int n = str.length(); 
	        PermutationString permutation = new PermutationString(); 
	        permutation.permute(str, 0, n - 1); 

		}
		 private void permute(String str, int l, int r) 
		    { 
		        if (l == r) 
		            System.out.println(str); 
		        else { 
		            for (int i = l; i <= r; i++) { 
		                str = swap(str, l, i); 
		                permute(str, l + 1, r); 
		                str = swap(str, l, i); 
		            } 
		        } 
		    }
		 public String swap(String a, int i, int j) 
		    { 
		        char temp; 
		        char[] charArray = a.toCharArray(); 
		        temp = charArray[i]; 
		        charArray[i] = charArray[j]; 
		        charArray[j] = temp; 
		        return String.valueOf(charArray); 
		    } 
		  

	}



