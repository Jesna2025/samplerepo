package inheritance;

public class HierarchialChildone extends HierarchialParent {
	
	public void hierarchialone()
	{
	System.out.println("Hierarchial Output from first child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildone s=new HierarchialChildone();
		s.displayhierarchialparent();
		s.hierarchialone();
	}

}
