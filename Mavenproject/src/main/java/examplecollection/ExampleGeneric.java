package examplecollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleGeneric {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add("Black");
		a.add("Yellow");
		a.add("blue");
		a.add("Maroon");
		
		System.out.println(a);
		
		ArrayList col=new ArrayList();
		
		col.add("100");
		col.add("200");
		col.add("300");
		col.add("400");
		
		System.out.println(col);
		
		
		//add one list to another list also
		
		
		System.out.println(a.addAll(col));
		System.out.println(a);
		
		System.out.println(a.contains("blue"));
		
		System.out.println(a.containsAll(col));
		

		Iterator itr=col.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		

	}
	
	itr.remove();
	System.out.println(col);

	}}
