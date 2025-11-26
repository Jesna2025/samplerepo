//check eligibility of candidate for voting using Static and Boolean method
package assignments;

import java.util.Scanner;

public class Ass5VotingStaticBoolean {
	
	public  static boolean voting()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int num=sc.nextInt();
		if(num>18)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ass5VotingStaticBoolean obj=new Ass5VotingStaticBoolean();
		System.out.println(Ass5VotingStaticBoolean.voting());

	}

}
//Enter age
//34
//true
