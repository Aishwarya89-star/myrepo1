package aggregationexample;

public class AggregationChild {

	
	int roll; 
	int mark;
	AggregationParent parent;
	
	
	public AggregationChild(int roll, int mark, AggregationParent parent) {
		
		this.roll=roll;
		this.mark=mark;
		this.parent=parent;
		
	}
	
	
	
	public void display() {
		
		
		
		System.out.println(roll+"      " +mark);

		System.out.println("--------------");
		System.out.println(parent.name+  "    "+parent.age);
	}
	public static void main(String[] args) {
		
		
		
		AggregationParent parentn=new AggregationParent("Aishwarya", 2);
		AggregationChild child=new AggregationChild(12,13,parentn);
		
		child.display();
		

	}

}
