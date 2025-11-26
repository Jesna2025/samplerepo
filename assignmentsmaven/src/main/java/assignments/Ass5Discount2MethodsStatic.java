//Write a program to check wheher the customer have discount
//(get 20% discount if total amount is greater than 5000)
//or not and get the final amount in main method(static methods)
//Get prices of items using parameterized method
//Method 1 Calculate total amount
//Method 2 Check discount
package assignments;

public class Ass5Discount2MethodsStatic {
	static double total;
	public static double amount(double item1,double item2,double item3)
	{
	
		total=item1+item2+item3;
		return total;
	}
	
public static void discount()
{
	if (total>5000)
	{
		double d;
		d=total*0.20;
		System.out.println("Amonut deductable as discount is "+d);
	}
	else
	{
		System.out.println("Not eligible for discount");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c;
		c=Ass5Discount2MethodsStatic.amount(1000.00d,2000.00d, 3000.00d);
		
		Ass5Discount2MethodsStatic.discount();
	}

}

//Output Amount deductable as discount is 1200.0
