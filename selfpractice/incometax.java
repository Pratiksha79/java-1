package selfpractice;

import java.util.Scanner;

public class incometax {

	{ 
		System.out.println("enter your income");
		Scanner s=new Scanner(System.in);
		
		float tax = 0.0f;
		float income= s.nextFloat();
		
		if (income<2.5f)
		{
		System.out.println("no tax ");
		}
		else if (income>2.5f && income<=5f)
		{
			tax=tax+0.05f*(income-2.5f);
		}
		else if (income>5f && income <=10f)
		{
			tax=tax+0.05f*(2.5f)+0.2f*(income-5f);
		}
		else if (income>10)
		{
			tax=tax+0.05f*2.5f+0.2f*5f+0.3f*(income-10f);
		}
	System.out.println(tax);
		
			
		}
	

	
	

		
				}
				
			
		
		
	
}
