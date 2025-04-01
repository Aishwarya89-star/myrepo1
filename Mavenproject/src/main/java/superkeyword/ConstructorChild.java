package superkeyword;

public class ConstructorChild extends ConstructorParent {
	
	public ConstructorChild() {
		
		
		super();
		System.out.println("Iam child");
	}
	
	public ConstructorChild(int a,int b) {
		
		super(2,3);
		int c=a+b;
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChild child2=new ConstructorChild();
		ConstructorChild child3=new ConstructorChild (12,13);
		
		
	}

}
