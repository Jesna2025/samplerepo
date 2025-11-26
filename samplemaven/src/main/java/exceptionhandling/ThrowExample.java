package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		
		int a=16;
		if (a>18)
		{
			System.out.println("Eligible for voting");
		}
		// TODO Auto-generated method stub
		else
		{
			throw new ArithmeticException("Not eligible for voting");
			//shows message in exception
		}

	}

}
