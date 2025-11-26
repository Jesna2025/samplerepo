package assignments;

public class AddressAggChildMethod {

	int rollno;
	String name;
	EmpAggParentMethod emp;
	public void Adress(int rollno,String name,EmpAggParentMethod emp)
	{
		this.rollno=rollno;
		this.name=name;
		this.emp=emp;
		
	}
	void dispaly()
	{
		System.out.println(rollno+" "+name+" "+emp.city+" "+emp.state+" "+emp.country);
		
	}
	
	public static void main(String[] args) {
		EmpAggParentMethod obj=new EmpAggParentMethod();
		obj.parent("Payyanur", "Kannur", "India");
		
		 AddressAggChildMethod  obj1=new  AddressAggChildMethod();
		 obj1.Adress(2231, "Elsa", obj);
		 
		 obj1.dispaly();
		
		

	}

}
