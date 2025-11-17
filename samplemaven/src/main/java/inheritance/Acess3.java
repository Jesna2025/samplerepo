package inheritance;

import accesspackage.Acess1;

public class Acess3 extends Acess1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acess3 obj3=new Acess3();
		obj3.dispaly1();//public method in other package
		obj3.dispaly3();//Protected method with the help of extends inheritance feature
		//WHY Default methods are not visible in other package????
	
	}

}
