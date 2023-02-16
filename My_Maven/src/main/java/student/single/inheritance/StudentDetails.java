package student.single.inheritance;

import java.util.Scanner;

public class StudentDetails extends Department
{
	String name;
	int rollno;
	int cls;
	char div;
	
	public void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		name=s.nextLine();
		System.out.println("Enter your roll number");
		rollno=s.nextInt();
		System.out.println("Enter your class");
		cls=s.nextInt();
		System.out.println("Enter your division");
		div=s.next().charAt(0);
	}
	public void display()
	{
		System.out.println("---Student---");
		System.out.println("Department : " +dep);
		System.out.println("Year of passing out : " +yr);
		System.out.println("Name : " +name);
		System.out.println("Roll number : " +rollno);
		System.out.println("Class : " +cls);
		System.out.println("Division : " +div);
	}

	public static void main(String[] args)
	{
		StudentDetails stu1=new StudentDetails();
		stu1.dep();
		stu1.get();
		stu1.display();
	}

}
