/* The given Java program calculates and displays the frequency of each character in an input string. It first takes input from the user and converts it into a character array. The program then iterates through each character and checks if it has already been counted by scanning previous characters in the array. If the character has not been counted before, it counts its occurrences in the entire string and prints the frequency. The use of nested loops makes this approach inefficient for large inputs, as it results in a time complexity of O(n²)*/

import java.util.*;
class FrequencyOfEachChar
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=s.nextLine();
		char a[]=str.toCharArray();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			char c=a[i];
			boolean vis=false;	
			for(int j=0;j<i;j++)
			{
				if(a[j]==c)
				{
					vis=true;
					break;
				}
			}
			if(!vis)
			{
				for(int k=0;k<a.length;k++)
				{
					if(a[k]==c)
					count++;
				}
			System.out.println("frequency of "+a[i]+" is:"+count);
			}
		}
	}
}
/*
output:
Enter a string: cvr college
frequency of c is:2
frequency of v is:1
frequency of r is:1
frequency of   is:1
frequency of o is:1
frequency of l is:2
frequency of e is:2
frequency of g is:1
*/