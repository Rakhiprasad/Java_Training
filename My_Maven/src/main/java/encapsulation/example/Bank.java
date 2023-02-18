package encapsulation.example;

public class Bank
{
	private double money;
	private String name;
	public double getMoney() 
	{
		return money;
	}
	public void setMoney(double money) 
	{
		this.money = money;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void calculate()
	{
		double i;
		i=money*2*7/100;
		money+=i;
	}
	

}
