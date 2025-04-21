package examplecollection;

import java.util.HashSet;
import java.util.Set;

public class ExampleSet {

	public static void main(String[] args) {
		Set a=new HashSet();
		
		a.add("100");
		a.add("200");
		a.add("239");
		a.add("300");
		a.add("400");
		a.add("500");
		
		System.out.println(a);
		
		
Set col=new HashSet();
		
		col.add("Zebra");
		col.add("Goat");
		col.add("Buffolo");
		col.add("Cow");
		col.add("Tiger");
		col.add("Calf");
		
		System.out.println(col);
		
		col.addAll(a);
		System.out.println(col);
		System.out.println("\n   \n ");
		
		a.containsAll(col);
		System.out.println(col);
		
		
		System.out.println(a.contains("200"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
		col.clear();
		System.out.println(col);
		
		a.remove("100");
		System.out.println(a);
	}

}
