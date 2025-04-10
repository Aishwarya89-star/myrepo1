package abstractionexample;

public class ExampleNormal  extends Example{
	
	public void get() {
		
		System.out.println("Iam method from Normal class");
	}

	public static void main(String[] args) {
		
		ExampleNormal child=new ExampleNormal();
		child.display();
		System.out.println(child.show());
		child.language();
		child.get();
		

	}

	@Override
	void display() {
		System.out.println("Showing abstarct method");
		
	}

	@Override
	int show() {
		
		int a=12;
		int b=13;
		int c=a+b;
		return c;
	}

}
