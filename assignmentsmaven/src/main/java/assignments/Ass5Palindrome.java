//Write a program to check whether the given number is Palindrome/Nor by using static methods
//Method 1 to fin d the reverse(pass the number in argument)
//Method2 to check palindrome or not
package assignments;
import java.util.Scanner;

public class Ass5Palindrome {
	
	int rev=0;
	int reverse(int n)
	{
		while(n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		return rev;
		
	}
	boolean palindrome(int n)
	{
	return(n)==reverse(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to check palindrome");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		Ass5Palindrome obj=new Ass5Palindrome();
		if(obj.palindrome(num))
		{
		System.out.println("The number"+num+" is palindrome");
		}
		else
		{
			System.out.println("The number "+num+" is not palindrome");
		}

	}

}
/*Enter number to check palindrome
333
The number333 is palindrome*/
