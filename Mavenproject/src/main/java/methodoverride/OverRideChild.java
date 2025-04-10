package methodoverride;

public class OverRideChild extends OverLoadParent {

	public static void main(String[] args) {
		OverRideChild child=new OverRideChild();
		child.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		
		System.out.println("Welcome");
	}

}
