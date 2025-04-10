package methodoverride;

public class MethodChild extends MethodParent {
	
	
	public void sum(int a, int b) {
		int c=a+b;
		System.out.println(c);
		super.sum(20, 30);
		
	}
	
	
	public void display() {
		
		
		System.out.println("Iam from Kayamkulam");
		super.display();
	}

	public static void main(String[] args) {
		 MethodChild child=new MethodChild();
		 child.sum(12,13);
		 child.display();

	}

}
