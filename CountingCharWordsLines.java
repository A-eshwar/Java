/*Write a Java Program that displays the number of characters, lines and words in a text file.*/

import java.io.*;
class CountingCharWordsLines
{
	public static void main(String args[]) throws IOException
	{
		int ch=0,l=0,w=0;
		String line;
		BufferedReader b=new BufferedReader(new FileReader("sample1.txt"));
		while((line=b.readLine())!=null)
		{
			l+=1;
			ch+=line.length();
			String words[]=line.split("\\s");
			w+=words.length;
		}
		System.out.println("No of characters:"+ch);
		System.out.println("NO of words:"+(w));
		System.out.println("No of lines:"+(l));
	}
}
/*sample1.txt:
hello World
hi 
how are you
*/
/*
This Java program reads a file (sample1.txt) and counts the number of characters, words, and lines in it.
Execution Flow:
Initialize Counters:
ch = 0 (Character count)
->l = 0 (Line count)
->w = 0 (Word count)
Read the File:

->A BufferedReader reads the file line by line (b.readLine()).
->For each line:
->Increment l (line count).
->Add the length of the line to ch (character count).
->Use split("\\s") to break the line into words and count them (w).
Display the Results:
->Prints the number of characters, words, and lines.

output:
No of characters:22
NO of words:5
No of lines:3
*/