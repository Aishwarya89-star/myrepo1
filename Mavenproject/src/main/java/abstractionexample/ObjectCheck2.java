package abstractionexample;

public class ObjectCheck2 extends ObjectCheck{
	
	
	public void gt() {
		
		
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		
		ObjectCheck object=new ObjectCheck2();
		object.show();
		object.display();
		
		// we cannot call method from normal class with abstract object
		// object.gt();
		

	}

	//@Override
	
	void show() {
		
		
		System.out.println("Implemented abstract method here");
		
	}

}
