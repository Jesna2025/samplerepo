package assignments;

public class Ass8InheritanceCalculateSalary extends Ass8InheritanceGetInfoSalary{

	public double hra;
	public double pf;
	public void calcuatehra()
	{
		hra=bpay*0.5;
		pf=bpay*0.20;
	
	}
	
}
