package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set a=new HashSet();
		//add
		a.add("banana");
		a.add("kiwi");
		a.add("mango");
		System.out.println(a);
		//addAll Method
		Set b=new HashSet();
		b.add("orange");
		b.add("grapes");
		b.add("strawberry");
		a.addAll(b);
		System.out.println(a);
		//output unordered list
		//Contains
		System.out.println(a.contains("kiwi"));
		System.out.println(a.contains("grapes"));
		//containsAll
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		//isempty
		System.out.println(a.isEmpty());
		//iterator will do it later
		//System.out.println(a.iterator());
		//remove
		System.out.println(a.remove("mango"));
		System.out.println(a);
		//removeAll
		System.out.println(a.removeAll(b));
		System.out.println(a);
		//size
		System.out.println(a.size());
		//clear
		a.clear();
		System.out.println(a);
	}

}
