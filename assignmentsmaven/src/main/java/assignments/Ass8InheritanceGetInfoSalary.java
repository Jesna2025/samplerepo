package assignments;
import java.util.Scanner;

public class Ass8InheritanceGetInfoSalary {
	public double bpay;
	public double deduct;
	public double bonus;
	public void  GetInfoSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay");
		double bpay=sc.nextDouble();
		System.out.println("Enter deduction");
		double deduct=sc.nextDouble();
		System.out.println("Enter bonus");
		double bonus=sc.nextDouble();
	}

}
