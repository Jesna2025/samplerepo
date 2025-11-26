package superkeyword;

public class SupervariableChild extends SupervariableParent {
	
	String s="Indigo";
	public void display()
	{
	System.out.println(s);
	System.out.println(super.s);
	}

	public static void main(String[] args) {
		SupervariableChild obj=new SupervariableChild();
		obj.display();
		// TODO Auto-generated method stub

	}

}
