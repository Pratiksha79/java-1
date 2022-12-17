package selfpractice;

public class starPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				if(i==2 && j>1 && j<4 || i==3 && j>1 && j<4)
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


