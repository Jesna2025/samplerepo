package assignments;

public class Ass6InstancesameMethodname {
	
	float avg;
	double Average(int no1,int no2,int no3)
	{
		avg=(no1+no2+no3)/3;
		return avg;
	}
	float Average(float no1,float no2,float no3)
	{
		avg=(no1+no2+no3)/3;
		return avg;
	}
	double Area(int b,int h)
	{
		return b*h;
	}
	
	double Area(int r)
	{
		return r*r*3.14;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ass6InstancesameMethodname obj=new Ass6InstancesameMethodname();
		System.out.println("Average of 3 integers "+obj.Average(10, 10, 10));
		System.out.println("Average of 3 float "+obj.Average(1.2f,1.0f, 2.0f));
		System.out.println("Area of rectangle "+obj.Area(5,10));
		System.out.println("Area of circle is "+obj.Area(5));
	}

}


/*Pgm to find Average of 3 Integer numbers ,3 float numbers (should have same method name)
 *Area of circle,rectangle square (3 method and same method name) */
/*Average of 3 integers 10.0
Average of 3 float 1.4
Area of rectangle 50.0
Area of circle is 78.5*/
