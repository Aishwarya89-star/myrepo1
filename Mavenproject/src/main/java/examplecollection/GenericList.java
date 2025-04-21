package examplecollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		//add 
		li.add("Blue");
		li.add("Black");
		li.add("green");
		li.add("Red");
		
		System.out.println(li);
		
		
		//set->To set some new element in an index position
		
		li.set(1, "White");
		System.out.println(li);
		li.add("White");
		System.out.println(li);
		
		//indexof-->To return the index of the element
		System.out.println(li.indexOf("White"));
		
		//lastindexof
		System.out.println(li.lastIndexOf("White"));
		
		//remove
		
		System.out.println(li.remove(2));
		System.out.println(li);
		//get
		System.out.println(li.get(2));
		//contains
		System.out.println(li.contains("White"));
		System.out.println(li.contains("violet"));
		//checking if it empty
		System.out.println(li.isEmpty());
		
		//size
		System.out.println(li.size());
		
		//for each iterator
		
		for(String col:li) {
			
			System.out.println(col);
		}
		
		for(int i=0;i<li.size();i++) {
			
			System.out.println(li.get(i));
			
				
			}
		}
		
	}


