package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4};
		for(int b:a) //syntax for(datatype variablename:ArrayName)
		{
			System.out.println(b);
		}
		
		List<String> f=new ArrayList <String>();
		f.add("RAMU");
		f.add("Radha");
		f.add("Raja");
		for(String h:f)//syntax for(datatype variablename:ArrayName)
		{
			System.out.println(h);
		}

	}

}
