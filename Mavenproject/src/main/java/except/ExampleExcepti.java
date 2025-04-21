package except;

public class ExampleExcepti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12;
int b=0;



try {
	
	
	int c=a/b;
	
	
}catch(ArithmeticException e) {
	
	System.out.println("exception handled");
}
	try {
		
		int z[]= {2,3,4,5};
		for(int i=0;i<=3;i++)
	
				{
			
						System.out.println(z[i]);
					}			
			
	}catch(ArrayIndexOutOfBoundsException e)
	
				{
						System.out.println(e);
			
			
					}
	
	

		finally {
	
	System.out.println("Exception not affected");
}

	}
	}
