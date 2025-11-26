package superkeyword;

public class SuperMethodChild extends SuperMethodParent{
	
	public void print()
	{
	System.out.println("SuperMethodChild");
	super.display();
	}

	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.print();//calling child method,we should call only child method :Scenario
				
	}

}
