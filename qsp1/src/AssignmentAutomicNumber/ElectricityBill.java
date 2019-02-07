package AssignmentAutomicNumber;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter the units consumed ");
		Scanner sc=new Scanner(System.in);
		double units=sc.nextDouble();
		System.out.println(" Enter the Arrears ");
		double arrears=sc.nextDouble();
		double cost=0.0;
		if(units>1 && units<=50)
		{
		     cost=units*1.20;
		}
		
		else if(units>50 && units<=100)
		{
			cost=50*1.2+(units-50)*2.4;
		}
		else if(units>100 && units<=150)
		{
			cost=50*1.20+50*2.40+(units-100)*3.60;
		}
		else if(units>150)
		{
			cost=50*1.20+50*2.40+50*3.60+(units-150)*4.80;
			if(units>200)
			{
				if(cost*5/100>=200)
				cost=cost-200;
				else
				cost=cost-cost*5/100;
				
			}
		}
	
		if(arrears>0)
		{
			cost=cost+arrears+arrears*10/100;
		}
		
		System.out.println(" Total amount is "+cost);

	}

}
