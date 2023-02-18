package encapsulation.example;

public class Customer extends Bank 
{
	public static void main(String[] arg)
	{
		Bank obj=new Bank();
		obj.setName("rak");
		obj.setMoney(10000);
		obj.calculate();
		System.out.println("Name of customer:"+obj.getName());
		System.out.println("Balance:"+obj.getMoney());
	}

}
