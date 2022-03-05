package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"rashika");    
	      hm.put(2,"puja");    
	      hm.put(3,"luvkush");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Entry<Integer, String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"raj");  
	      ht.put(5,"Raushan");  
	      ht.put(6,"vishal");  
	      ht.put(7,"mohit");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Entry<Integer, String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"ranu");    
	      map.put(9,"anup");    
	      map.put(10,"sandeep");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Entry<Integer, String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  

}
