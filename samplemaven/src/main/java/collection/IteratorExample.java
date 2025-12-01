package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> s=new HashSet<String>();
		s.add("ramu");
		s.add("radha");
		s.add("shambu");
		//iterator
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		//remove last element
		System.out.println(s);
	}

}
