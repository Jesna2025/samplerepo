package assignments;

public class AddressAggChild {
	
	int empid;
	String name;
	EmpAggParent ref;
	public AddressAggChild(int empid,String name,EmpAggParent ref)
	{
		this.empid=empid;
		this.name=name;
		this.ref=ref;
	}
	void display()
	{
		System.out.println(empid+""+name);
		System.out.println(ref.city+""+ref.state+""+ref.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpAggParent obj=new EmpAggParent("kannur","kannur","India");
		AddressAggChild obj1=new AddressAggChild(2245,"Muthu",obj);
		obj1.display();
		
		
		
	}

}
