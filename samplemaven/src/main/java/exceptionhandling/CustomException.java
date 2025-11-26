package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int a=16;
		if (a>18)
		{
			System.out.println("Eligible for voting");
		}
		// TODO Auto-generated method stub
		else
		{
			throw new VotingException("Not eligible for voting");
			//shows message in exception
		}

	}

}
