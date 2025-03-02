/*calculating frequency of a given character in a string*/
import java.util.*;
class FrequencyOfChar
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=s.nextLine();
		int count=0;
		System.out.println("Enter char to calculate frequency:");
		char c=s.nextLine().charAt(0);	
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(c==a[i])
				count+=1;
		}
		System.out.println("frequency of "+c+" is:"+count);
	}
}
/*
output:
Enter a string: cvr college
Enter char to calculate frequency:
c
frequency of c is:2
*/