package assignments;

import java.util.Scanner;

public class Ass12EncapGetpin {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pin");
		int p=sc.nextInt();
		
		Ass12WithdrawATMBank b=new Ass12WithdrawATMBank();
		b.SetPin(p);
		if(b.ValidatePin())
		{
			System.out.println("PIn Validated successfully");
			System.out.println("Enter amount to withdraw");
			double amt=sc.nextDouble();
			b.withdraw(amt);
		}
		else 
		{
			System.out.println("Invalid pin");
		}

	}

}
//program to withdraw amount from an ATM
//class 1Bank one method to set pin from User class and validate Pin in another method
//Valid pin 1001,1234,1212
//Pin number should declared as private
//Class 2User Get the pin from User
//Output enter pin

/*1212
PIn Validated successfully
Enter amount to withdraw
200
Withdrawal successful*/
