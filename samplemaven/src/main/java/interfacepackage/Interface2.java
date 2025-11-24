package interfacepackage;

public class Interface2 implements Interface1{
//from interface to class USE implements
	public static void main(String[] args) {
		Interface2 obj=new Interface2();
		obj.display();
		obj.print();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		
		System.out.println("Display from Inteface");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("Print from Inteface");
		// TODO Auto-generated method stub
		
	}

}
