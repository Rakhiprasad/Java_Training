package vehicle.multilevel.inheritance;

import java.util.*;
public class Price extends Details 
{
	int price;
	public void price()
	{
		Scanner s=new Scanner(System.in);
		 System.out.println("price");
		 price=s.nextInt();
	}
	public void display()
	{
		if(wheel==2)
		 {
			 	System.out.println("---TWO WHEELER---");
				System.out.println("Year : " +year);
				System.out.println("speed : " +speed+"km/hr");
				System.out.println("model number : " +model);
				System.out.println("colour : " +color);
				System.out.println("price : " +price);
		 }
		 else if(wheel==4)
		 {
			 	System.out.println("---FOUR WHEELER---");
				System.out.println("Year : " +year);
				System.out.println("speed : " +speed+"km/hr");
				System.out.println("model number : " +model);
				System.out.println("colour : " +color);
				System.out.println("price : " +price);
		 }
		 else
		 {
			 System.out.println("Invalid selection"); 
			
		 }
		
	}
	public static void main(String[] arg)
	{
		Price car1=new Price();
		car1.typ();
		
		switch(car1.wheel)
		{
		case 2:
		case 4:
			car1.get();
			car1.price();
			car1.display();
			break;
		default:
			System.out.println("Invalid Selection");
		}
		
		
	}
	

}
