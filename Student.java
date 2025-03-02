/*Create a class Student with fields name, rollNumber, name,age ,college and  grade. Implement getters and setters for these fields. Demonstrate usage in the main method.*/
class Student 
{
	private int age,rollno;
	private double grade;
	private String name,college;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCollege(String college)
	{
		this.college=college;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public void setGrade(double grade)
	{
		this.grade=grade;
	}
	public String getName()
	{
		return name;
	}
	public String getCollege()
	{
		return college;
	}
	public double getGrade()
	{
		return grade;
	}
	public int getRollno()
	{
		return rollno;
	}
	public int getAge()
	{
		return age;
	}
	public static void main(String args[])
	{
		Student s=new Student();
		s.setName("bunny");
		s.setRollno(6712);
		s.setGrade(9.6);
		s.setCollege("cvr");
		s.setAge(19);
		System.out.println("Student Details:");
		System.out.println("Name: "+s.getName());
		System.out.println("Rollno: "+s.getRollno());
		System.out.println("College: "+s.getCollege());
		System.out.println("Age: "+s.getAge());
		System.out.println("Grade: "+s.getGrade());
	}
}
/*
output:
Student Details:
Name: bunny
Rollno: 6712
College: cvr
Age: 19
Grade: 9.6
*/

/*Explanation:
The given Java program defines a Student class with attributes, setter and getter methods, and a main method to create an instance of the class and display student details.

Breakdown of the Code Execution
1. Class Definition (Student)
->The Student class contains five private attributes:
->name (String) – Stores the student’s name.
->college (String) – Stores the college name.
->age (int) – Stores the student’s age.
->rollno (int) – Stores the student’s roll number.
->grade (double) – Stores the student’s grade.
2. Setter Methods (setName, setCollege, etc.)
->These methods allow setting values for each private attribute using the this keyword to differentiate between instance variables and method parameters.
3. Getter Methods (getName, getCollege, etc.)
->These methods allow retrieving and returning the values of private attributes.
4. main Method Execution
->Creates an instance of Student using new Student().
->Calls setter methods to assign values:
Name = "bunny"
Roll number = 6712
Grade = 9.6
College = "cvr"
Age = 19
->Prints the student details using getter methods.*/