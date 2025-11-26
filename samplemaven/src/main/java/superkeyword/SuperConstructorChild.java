package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	public SuperConstructorChild()
	{
		super(5,5);
		System.out.println("Default Constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj=new SuperConstructorChild();

	}

}
