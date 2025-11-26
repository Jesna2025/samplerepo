package assignments;

public class Ass7thisFactorial {
	
	int n;
	int a=1;
	public void factorial(int n)
	{
		this.n=n;
		int temp=this.n;
		while(temp>0)
		{
			
			a=a*temp;
			temp=temp-1;
		}
		
		this.display();
	}
	public void display()
	{
		System.out.println("factorial of this using this method is"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass7thisFactorial s=new Ass7thisFactorial();
		s.factorial(5);

	}

}
//Program to find the factorial of a number
//112 methods, one for find calculate and other for print result
//pass the arguments
//Main method allows to invoke only one method
//OUTPUT factorial of this using this method is 120
