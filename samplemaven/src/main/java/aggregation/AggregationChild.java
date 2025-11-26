package aggregation;

public class AggregationChild {
	//no direct connection we use Reference variable
	String city;
	String state;
	AggregationParent ref;
	
	public AggregationChild(String city,String state,AggregationParent ref)
	{
		//using 
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name+" "+ref.rollno+" "+ref.address+" "+city+" "+state);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationParent obj=new AggregationParent("Elsa",13,"abcdvdh2");
		AggregationChild obj1=new AggregationChild("Montrea","Quebec",obj);//obj is the value of reference variable that represents the parent class
		obj1.display();
	}

}
