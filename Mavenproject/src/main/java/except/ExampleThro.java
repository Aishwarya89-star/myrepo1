package except;

public class ExampleThro {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int a=9;
		
		if(a>=18) {
			
			System.out.println("eligible for voyiong");
		}else {
			
			throw new Exception("Not eligible");
		}

	}

}
