/*Reverse of array elements without creating another array*/
import java.util.*;
class ReverseofArray
{
	public static void main(String args[])
	{	
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=s.nextInt();
		int []a=new int[n];
		System.out.println("Enter values:");		
		for(int i=0;i<n;i++)
		{	
			a[i]=s.nextInt();
		}
		for(int i=0;i<n/2;i++)
		{
			int j=a.length-1-i;
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
		System.out.println("--Reversed values--");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}	
/*
output:
Enter size:
3
Enter values:
1
2
3
--Reversed values--
3
2
1
*/