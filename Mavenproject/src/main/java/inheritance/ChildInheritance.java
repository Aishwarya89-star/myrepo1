package inheritance;

public class ChildInheritance extends SingInheritance {
	
	public void display(){
		System.out.println("This is child class");
		
		
	}

	public static void main(String[] args) {
		
		ChildInheritance child=new ChildInheritance();
		child.display();
		child.display1();
		
	}

}
