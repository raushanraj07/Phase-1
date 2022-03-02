package com.collection;
import java.util.*;
public class Collection {

	public static void main(String[] args) {

		System.out.println("Arrays");
		ArrayList<String>name=new ArrayList<String>();
           name.add("raj");
           name.add("golu");

   		System.out.println(name);
   		

		System.out.println("\n");

		System.out.println("vector");
		
		Vector<Integer>i=new Vector();
		i.addElement(11);
		i.addElement(12);

		System.out.println(i);

		System.out.println("\n");

		System.out.println("LinkedList");
		LinkedList<String>city=new LinkedList<String>();
		city.add("pune");
		city.add("delhi");
         Iterator<String>itr=city.iterator();
         while(itr.hasNext()) {

     		System.out.println(itr.next());
         }

    		System.out.println("\n");

    		System.out.println("HashSet");
              HashSet<Integer>j=new HashSet<Integer>();
              j.add(24);
              j.add(25);
              j.add(26);

      		System.out.println(j);
      		

    		System.out.println("\n");

    		System.out.println("LinkedHashSet");
    		
    		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
    		set.add(55);
    		set.add(56);
    		set.add(57);

    		System.out.println(set);
    		
      		
         
		
		
	}
	

}
