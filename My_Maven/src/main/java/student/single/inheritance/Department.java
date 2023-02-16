package student.single.inheritance;

import java.util.*;
public class Department 
{
	String dep;
	int yr;
	public void dep()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your department");
		dep=sc.nextLine();
		System.out.println("Enter your year of passing out");
		yr=sc.nextInt();		
		
	}
	

}
