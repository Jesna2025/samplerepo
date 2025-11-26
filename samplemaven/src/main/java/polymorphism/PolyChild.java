package polymorphism;

public class PolyChild extends PolyParent{
	
	public void sum(int a, int b)
	{
		int c=a-b;
		super.sum(10, 5);
		System.out.println("sub is"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyChild obj=new PolyChild();
		obj.sum(5, 2);

	}

}
