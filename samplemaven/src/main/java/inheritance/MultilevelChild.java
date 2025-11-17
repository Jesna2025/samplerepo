package inheritance;

public class MultilevelChild extends MultilevelParent{
	public void print() {
		System.out.println("MultilevelInheritance child output");
}
	public static void main(String[] args) {
		MultilevelChild c=new MultilevelChild();
		c.displayGP();
		c.displayP();
		c.print();
	}

}
