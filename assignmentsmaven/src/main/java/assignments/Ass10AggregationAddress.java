package assignments;

public class Ass10AggregationAddress {
	
	String city;
	String country;
	Ass10AggregationStudent  ref;
	public Ass10AggregationAddress(String city,String country,Ass10AggregationStudent ref)
	{
		this.city=city;
		this.country=country;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("name"+ref.name+"rollnumber"+ref.rollnumber);
		System.out.println("city"+city+"country"+country);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass10AggregationStudent m=new Ass10AggregationStudent("Jesna",36);
		Ass10AggregationAddress n=new Ass10AggregationAddress("Kannur","Kerala",m);
		n.display();

	}

}
//Write a program to get thr details of a student 
//class 1-Student
//get the student name and roll number
//Class 2 Address
//Get the address of student
//Print Student name roll number with address
//There is no IS -A relationship
//OUTPUT nameJesnarollnumber36
//cityKannurcountryKerala