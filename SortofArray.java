/* sorting of array*/
import java.util.*;
class SortofArray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=s.nextInt();
		int []a=new int[n];
		System.out.println("Enter values:");		
		for(int i=0;i<n;i++)
		{	
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
     			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("---sorted elements---");
		for(int i=0;i<n;i++)
		{	
			System.out.println(a[i]);
		}
	}
}
/*
output:
Enter size:
5
Enter values:
32
1
22
34
65
---sorted elements---
1
22
32
34
65
*/