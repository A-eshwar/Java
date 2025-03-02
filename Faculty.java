/*To illustrate the concept of inheritance, develop an application using the hierarchy of employees in a university.*/

class University//GRAND PARENT CLASS
{
	int id;
	String name;
	final String college="cvr";
	void display()
	{
		System.out.println("Employee details:");
	}
}
class HOD extends University//PARENT CLASS
{
	void display(int id,String name)
	{
		System.out.println("COLLEGE: "+college);
		System.out.println("HOD ID: "+id);
		System.out.println("HOD NAME: "+name);
	}
}
public class Faculty extends HOD//CHILD CLASS
{
	Faculty(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String args[])
	{
		Faculty o2=new Faculty(3457,"JONES");	
		int hid=3456;
		String hname="SMITH";
		o2.display();
		o2.display(hid,hname);
		System.out.println("Faculty ID: "+o2.id);
		System.out.println("Faculty NAME: "+o2.name);
	}
}
/*
output:
Employee details:
COLLEGE: cvr
HOD ID: 3456
HOD NAME: SMITH
Faculty ID: 3457
Faculty NAME: JONES*/

/*Explanation:
The given Java program demonstrates multilevel inheritance, where the Faculty class extends HOD, which in turn extends University. The University class contains common attributes such as id, name, and a final variable college initialized as "cvr". It also has a display() method that prints "Employee details:". The HOD class defines an overloaded display(int id, String name) method to print the college name along with HOD details. The Faculty class inherits from HOD and initializes its attributes using a constructor. In the main method, an object of Faculty is created with ID 3457 and name "JONES". It then calls display() from University, followed by the overloaded display(int, String) from HOD using predefined values 3456 and "SMITH". Finally, it prints the id and name of the Faculty object, resulting in the given output.
*/