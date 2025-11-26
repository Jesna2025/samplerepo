package abstraction;

public class AbstractChild extends AbstractionParent  {

	public static void main(String[] args) {
		
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.print();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("display from the abstract method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("Print from the abstract method");
		// TODO Auto-generated method stub
		
	}

}
