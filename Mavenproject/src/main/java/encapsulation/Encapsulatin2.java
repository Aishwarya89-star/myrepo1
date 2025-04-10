package encapsulation;

public class Encapsulatin2 {

	public static void main(String[] args) {
		PrivatePkg pkg=new PrivatePkg();
		pkg.setUsername("Aishwarya");
		pkg.setPassword("Ais");
		
		System.out.println(pkg.getUsername());
		System.out.println(pkg.getPassword());

	}

}
