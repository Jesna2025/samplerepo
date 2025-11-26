package assignments;

public class Ass11PolyDiscountOnseason extends Ass11PolyDiscountOffseason {
	public void discount()
	{
		int price=1000;
		double d;
		double discout;
		d=1000*.4;
		discout=price-d;
		System.out.println("Price after Onseason discount is"+discout);
		super.discount();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass11PolyDiscountOnseason obj=new Ass11PolyDiscountOnseason();
		obj.discount();
		
	}

}
//Polymorphism
//Program to calculate discount if customer purchase clothes on Offseason,set discount 15%
//and onseason 40%
//Should use 2 classes ,On season and Off season 
//Use 2 methods-discount(method name should be same)

//OutPUT
//Price after Onseason discount is600.0
//Price after offseason discount is850.0
