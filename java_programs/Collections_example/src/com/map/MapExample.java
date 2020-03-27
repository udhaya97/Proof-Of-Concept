package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public void hashmap()
	{
		/* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");

	      //using for Each
	      System.out.println("----------HashMap--------------using For Each Loop !");
          for(Map.Entry<Integer,String> entry : hmap.entrySet())
          {
           System.out.println(" Key is : "+entry.getKey() + " Value is : "+entry.getValue());
	      
          }
	      /* Display content using Iterator*/
           System.out.println("--------------using Iterator--------------- !");
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);

	      /* Remove values based on key*/
	      hmap.remove(3);
	      System.out.println("/nMap key and values after removal:");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }

	   

	}
	public void treeMap()
	{
		
	
		 /* This is how to declare TreeMap */
	      TreeMap<Integer, String> tmap = 
	             new TreeMap<Integer, String>();

	      /*Adding elements to TreeMap*/
	      tmap.put(1, "Data1");
	      tmap.put(23, "Data2");
	      tmap.put(70, "Data3");
	      tmap.put(4, "Data4");
	      tmap.put(2, "Data5");
	      
	      System.out.println("----------TreeMap--------------using For Each Loop !");
          for(Map.Entry<Integer,String> entry : tmap.entrySet())
          {
           System.out.println(" Key is : "+entry.getKey() + " Value is : "+entry.getValue());
          }
	      

	      /* Display content using Iterator*/
           
	      Set set = tmap.entrySet();
	      Iterator iterator = set.iterator();
	      System.out.println("----------TreeMap--------------using Iterator !");
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	   
	}
	public void linkedHashMap()
	{
		// HashMap Declaration
        LinkedHashMap<Integer, String> lhmap = 
                new LinkedHashMap<Integer, String>();

        //Adding elements to LinkedHashMap
        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(2, "Karon");
        lhmap.put(100, "Jim");

        System.out.println("----------linkedHashMap--------------Using for Each loop ! ");
        for(Map.Entry<Integer,String> entry : lhmap.entrySet())
        {
         System.out.println(" Key is : "+entry.getKey() + " Value is : "+entry.getValue());
	      
        }
        
        // Generating a Set of entries
        Set set = lhmap.entrySet();

        // Displaying elements of LinkedHashMap
        System.out.println("----------TreeMap--------------using Iterator !");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
           Map.Entry me = (Map.Entry)iterator.next();
           System.out.print("Key is: "+ me.getKey() + 
                   "& Value is: "+me.getValue()+"\n");
        }
   
	}
}

