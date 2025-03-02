/*These are the examples of annotations*/
import java.util.*;
class Calculator
{
	@Deprecated
	public void addition(int a,int b)
	{
		System.out.println("Deprecated method:addition of a and b:"+(a+b));
	}
	public void addition1(int a,int b)
	{
		System.out.println("addition of a and b:"+(a+b));
	}
	@SuppressWarnings("deprecation")
	public void usedep(int a,int b)
	{
		addition(a,b);
	}
	public void show()
	{
		System.out.println("This is a method show");
	}
}
class Example extends Calculator
{
	@Override
	public void show()
	{
		System.out.println("This is method show which was Overriden");
	}
}
public class AnnotationDemo
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		System.out.println("-----Using Suppresswarning anotation-----");
		List<String> list=new ArrayList();
		list.add("Hello");
		list.add("world");
		for(Object o:list)
		{
			System.out.println(o);
		}
		System.out.println("-----Using Deprecated anotation-----");
		Calculator c=new Calculator();
		c.usedep(1,2);
		c.addition1(1,2);
		Example e=new Example();
		System.out.println("-----Using Override anotation-----");
		e.show();
	}
}
/*
output:
-----Using Suppresswarning anotation-----
Hello
world
-----Using Deprecated anotation-----
Deprecated method:addition of a and b:3
addition of a and b:3
-----Using Override anotation-----
This is method show which was Overriden
*/

/*Explanation:
This Java program demonstrates Annotations (@Deprecated, @SuppressWarnings, and @Override) using a simple calculator and inheritance.
1. @Deprecated Annotation
->addition(int a, int b) is marked as deprecated, meaning it should not be used.
->A new method addition1(int a, int b) replaces it.
->The method usedep(int a, int b) calls the deprecated method but is annotated with @SuppressWarnings("deprecation") to prevent compiler warnings.
2. @SuppressWarnings Annotation
->Suppresses warnings in two cases:
->"deprecation": Allows using deprecated methods without warnings.
->"unchecked": Prevents unchecked type warnings when using raw types (ArrayList without generics).
3. @Override Annotation
->Ensures correct method overriding.
->The Example class extends Calculator and overrides the show() method.
->The overridden method prints "This is method show which was Overriden" instead of the base class message.
*/

		