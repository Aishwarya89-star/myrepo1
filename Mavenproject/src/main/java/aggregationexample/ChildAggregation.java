package aggregationexample;

public class ChildAggregation {
	
	
	int postalcode;
	String state;
	ParentAggregation parent;
	
	
	public ChildAggregation(int postalcode,String state,ParentAggregation parent) {
		
		
		
		this. postalcode=postalcode;
		this.state=state;
		this.parent=parent;
		
	}
	
	public void display()
	{
		
		System.out.println("The address of concerned persion is Name :->"+parent.name);
		System.out.println("                                            "+parent.address);
		System.out.println("                                            "+postalcode);
		System.out.println("                                            "+state);
		
	}	

	public static void main(String[] args) {
		
		
		ParentAggregation parentn=new ParentAggregation("Aishwarya","Kalpakasseril");
		
		ChildAggregation child=new ChildAggregation(690531,"Allapuza",parentn);
		
		child.display();
	}

}
