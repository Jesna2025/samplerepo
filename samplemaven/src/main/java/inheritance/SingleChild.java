package inheritance;

public class SingleChild extends SingleParent {
	
	public void print()
	{
	System.out.println("Single inheritance output from child's method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild s=new SingleChild();
		s.display();//display function from parent is called in child's main method
		s.print();

	}

}
