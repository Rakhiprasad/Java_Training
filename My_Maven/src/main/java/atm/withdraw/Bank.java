package atm.withdraw;

public class Bank 
{
	private int pin;
	private String name;
		
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void validate()
	{
		if(pin<=9999)
		{
			if(pin>=1000)
			{
				System.out.println("you entered a valid pin");
			}
			
		}
		else
		{
			System.out.println("you entered invalidvalid pin");
			setPin(0);
		}
	}

}
