package selfpractice;

public class NoPattern {
public static void main(String[] args)
/* 1
   1 2
   1 2 3 
   1 2 3 4 */ // and for 
                         /* 1         // you just have to print "i"
                            2 2
                            3 3 3
                            4 4 4 4  */
                         
  {
	int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}

