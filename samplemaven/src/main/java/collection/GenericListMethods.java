package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> s=new ArrayList<String>();
		//add ing items in to the list with add()
		
		s.add("chakka");
		s.add("manga");
		s.add("pazham");
		s.add("thenga");
		s.add("kapakaa");
		s.add("munthiri");
		System.out.println("list of stirng itmes are"+s);
		
		//get an element at the specified index
		System.out.println(s.get(2));
		//set a new value at the given index
       System.out.println(s.set(3, "moosambi"));
       //indexof() to get the first occurance of the element and lastindexof
       List <String> a= new ArrayList<String>();
       a.add("sasi");
       a.add("ravi");
       a.add("meri");
       a.add("sasi");
       a.add("ramu");
       a.add("ravi");
       System.out.println(a.indexOf("ravi"));//1
       System.out.println(a.lastIndexOf("ravi"));//5
       //remove() to remove an element with index and element 
       System.out.println(a.remove(2));
       System.out.println(a);//sasi,ravi,sasi,ramu,ravi
       System.out.println(a.remove("ramu"));//true
       System.out.println(a);//sasi,ravi,sasi,ravi
       //contains check whether given element is present or not
       System.out.println(a.contains("ravi"));
       //is Empty or not 
       System.out.println(a.isEmpty());//false
       //size
       System.out.println(a.size());
       
	}

}
