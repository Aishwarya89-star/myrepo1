package inheritance;

public class MultilevelChild extends MultilevelIntermediate {
	
	
	public void diaplay2() {
		
		System.out.println("Am back to ");
	}

	public static void main(String[] args) {
		
		MultilevelChild child=new MultilevelChild();
		child.display();
		child.display1();
		child.diaplay2();
		
		

	}

}
