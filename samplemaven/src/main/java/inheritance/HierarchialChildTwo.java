package inheritance;

public class HierarchialChildTwo extends HierarchialParent{
	public void hierarchialtwo()
	{
	System.out.println("Hierarchial Output from second child");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildTwo  s= new HierarchialChildTwo();
		s.displayhierarchialparent();
		s.hierarchialtwo();

	}

}
