package selfpractice;

public class starPattern6 {
	public static void main(String[] args) // this is my method this is easy
	/* {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
				System.out.println();
			}
		}
	} /*

// this is smart programming's method
 * 
 */
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i>=2 && j<=i-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
			}
		}
	}
	

 




