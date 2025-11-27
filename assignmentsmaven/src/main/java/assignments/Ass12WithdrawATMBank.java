package assignments;

public class Ass12WithdrawATMBank {
	
	private double pin;
	public void SetPin(int pin)
	{
		this.pin=pin; 
	}
	public boolean ValidatePin()
	{
		if(pin == 1001 || pin == 1234 || pin==1212)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal successful");
	}

}

