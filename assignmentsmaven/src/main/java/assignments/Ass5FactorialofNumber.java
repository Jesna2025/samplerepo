//Write a program to find factorial of a number 
//OUTPUT Factorial of given <<number>> is <<result>>
//5!=1*2*3*4*5

package assignments;
import java.util.Scanner;

public class Ass5FactorialofNumber {
	
	public static void Factorial()
	{
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			
			fact =fact*i;
	
			
		}
		System.out.println("Factorial of given no "+n+" is "+ fact);
		
	}

	public static void main(String[] args) {
		Ass5FactorialofNumber.Factorial();
  
	}

}
//Enter number 5
//Factorial of given no 5 is 120
