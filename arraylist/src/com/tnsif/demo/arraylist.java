package com.tnsif.demo;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          ArrayList<String> a1=new ArrayList<String>();
          System.out.println("ENTER THE DATA:");
               a1.add("Sravya");
               a1.add("Bhavya");
               a1.add("Asritha");
               for(String s:a1)
               {
            	   System.out.println(s);
               }
               //insert new value at zeroth index
               System.out.println("AFTER INSERTION:");
               a1.add(0,"ruhe");
               for(String s:a1)
               {
            	   System.out.println(s);
               }
               //delete Asritha
               System.out.println("AFTER DELETION:");
               a1.remove("Asritha");
               for(String s:a1)
               {
            	   System.out.println(s);
               }
               System.out.println("AFTER UPDATE:");
               a1.set(2, "chinnu");
               for(String s:a1)
               {
            	   System.out.println(s);
               }
               //sorting data
               System.out.println("SORTING DATA:");
               Collections.sort(a1);
               for(String s:a1)
               {
            	   System.out.println(s);
               }
               }

}
