package array;

public class ascendingarray {
	public static void main(String[] args)
	{
		int a[]= {12,34,5,9,3,1};
		int temp,i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=1;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	

}
}