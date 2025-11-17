package accesspackage;

public class Acess1 {
	public void dispaly1()
	{
	System.out.println("Public method");
	}
	private void dispaly2()
	{
	System.out.println("Private method");
	}
	protected void dispaly3()
	{
	System.out.println("Protected method");
	}
	//default
	void display4()
	{
		System.out.println("default method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Acess1 obj1=new Acess1();
       obj1.dispaly1();
       obj1.dispaly2();
       obj1.dispaly3();
       obj1.display4();
       //Within the class these 4 methods private protected default and public have visibility
	}

}
