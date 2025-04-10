package encapsulation;

public class ExampleEcapsulationSecond {

	public static void main(String[] args) {
		
		ExampleEncapsulation encapsule=new ExampleEncapsulation();
		encapsule.setAge(24);
		encapsule.setName("Aishwarya ");
		
		int at=encapsule.getAge();
		
		
		System.out.println(at);
		System.out.println(encapsule.getName());
		
		

	}

}
