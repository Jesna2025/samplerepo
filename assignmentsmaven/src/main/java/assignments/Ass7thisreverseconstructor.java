package assignments;

public class Ass7thisreverseconstructor {

	
	int a;
	int n;
	int reversed;
	public Ass7thisreverseconstructor()
	{
		System.out.println("Finding Reverse");
		
	}
	public Ass7thisreverseconstructor(int a)
	{
		this();
		this.a=a;
		int temp=a;
		while(temp>0)
		{
		n=temp%10;
		reversed=reversed*10+n;
		temp=temp/10;
		}
		System.out.println("reverse of the number is"+reversed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass7thisreverseconstructor a=new Ass7thisreverseconstructor(234);	

	}

}
//ASSKKKprogram to find the reverse of a number
// here we have call calculation first then display which is possible since THIS Constructor should be at first 
//2 constructors one for calculations reverse and other for display "Finding the reverse
//Argument variable and instance should be same 
//Main method allows to invoke only one method
