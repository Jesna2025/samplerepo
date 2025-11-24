package inheritance;

public class MultipleChild implements MultipleParent1,MultipleParent2{
	
	public void display()
	{
		System.out.println("Display from the child");
	}

	public static void main(String[] args) {
		
		MultipleChild m=new MultipleChild();
		m.display();
		m.show();
		m.print();
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print from Interface Parent1");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Print from Interface Parent2");
		
	}

}
