package assignments;

public class Ass9SuperKeyword extends Ass9SuperAddtiton {

	public void div(int x,int y)
	{
	int result=super.addition(x,y);
	if (result%10==0)
	{
		System.out.println(result +"it is divisible by zero");
	}
	else
	{
		System.out.println(result +"it is not divisible by zero");
	}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass9SuperKeyword g=new Ass9SuperKeyword();
		g.div(2,18);

	}

}
//program to check the addition result is divisible by 10
//class 1
//Return addition result of two numbers
//class2
//Check the addition result is divisible by 10 (use super key word)
//OUTPUT 20is divisible by zero