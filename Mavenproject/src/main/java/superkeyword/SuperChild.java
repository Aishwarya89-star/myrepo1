package superkeyword;

public class SuperChild extends SuperInstance{
	
	String color="red";
	
	public void display() {
		
		System.out.println(color);
		//super keyword can be used in diff method not in main method
		System.out.println(super.color);
		
	}

	public static void main(String[] args) {
		
		SuperChild child=new SuperChild();
		child.display();
		

	}

}
