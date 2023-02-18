package atm.withdraw;

import java.util.*;
public class User extends Bank 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		User obj=new User();
		System.out.println("Enter your Name");
		String name=s.nextLine();
		System.out.println("Enter four digit number as your pin");
		int n=s.nextInt();
		obj.setName(name);
		obj.setPin(n);
		obj.validate();
		System.out.println(obj.getName()+", your pin is "+obj.getPin());
	}
	
}
