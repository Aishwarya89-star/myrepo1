package superkeyword;

public class SuperChild1 extends SuperParent{
	
	public void show() {
		
		
		System.out.println("Welcome to ooty");
		super.display();
		
		//this keyword can be used for the current class
		this.result();
	}
	
	public void result() {
		
		
		System.out.println("The result is");
		super.add();
	}

	public static void main(String[] args) {
		SuperChild1 child1=new SuperChild1();
		child1.show();
		//child1.display();
		//child1.result();

	}

}
