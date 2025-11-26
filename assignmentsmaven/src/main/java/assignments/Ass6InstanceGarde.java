package assignments;

public class Ass6InstanceGarde {
	
	 float total;
	
	public Ass6InstanceGarde(float sub1,float sub2,float sub3)
	{
		
		total=sub1+sub2+sub3;
		
	}
	
	float grade()
	{
		if(total>70)
		{
			System.out.println("A grade");
		}
		else
		{
			System.out.println("B grade");
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ass6InstanceGarde obj=new Ass6InstanceGarde(25.2f,24.3f,25.0f);
		System.out.println(obj.grade());
		Ass6InstanceGarde obj1=new Ass6InstanceGarde(10.2f,12.3f,10.0f);
        
        System.out.println(obj1.grade());
	}

}
/*Write a progrm to find the garde of 2 students based on total marks(3 subjects)
 * get the students marks by constructor,Return total mark to main method,Find the garde of eache student*/

//A grade 
//74.5
//B grade
//32.5
