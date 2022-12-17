package selfpractice;

public class NoPatern2 {
	public static void main(String[] args) {
		
	
 /* 1
    2 1
    3 2 1
    4 3 2 1 */
	
	int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=i;j>=1;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
    
}
}    
