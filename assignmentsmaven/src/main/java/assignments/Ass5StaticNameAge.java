package assignments;

public class Ass5StaticNameAge {
	
	public static void StudentDetails()
	{
	System.out.println("Details of student");
	}
	
	public static void display(String name, int age)
	{
	System.out.println(name+" "+age);
	}
	
	public static void main(String args[])
	{
		Ass5StaticNameAge.StudentDetails();
		Ass5StaticNameAge.display("Elsa",12);
	}
	}

	/*Q1 Write a program to set your name and age by a static method and get them in an another static method*/
	//OUTPUT 
	//Details of student
	//Elsa 12

