package accessspecifier;

public class AccessExample {
	
	
	
	public void show() {
		
		System.out.println("This is a public method");
		
		}
	
	
	private void showprivate() {
		
		System.out.println("This is a private method");
		
	}

	protected void showprotected() {
		
		System.out.println("This is a protected method");
		
	}
	
	
	void showdefault() {
		
		
		System.out.println("Showing default method");
	}
	public static void main(String[] args) {
		AccessExample example=new AccessExample();
		example.show();
		example.showprivate();
		example.showdefault();
		example.showprotected();

	}

}
