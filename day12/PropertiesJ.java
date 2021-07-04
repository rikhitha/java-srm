package day11.comparator.java.com;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;



public class PropertiesJ {

	public static void main(String[] args)
	{
		Properties creator = new Properties();
	      Set states;
	      String str;
	      
	      creator.put("Python", "Guido van Rossum");
	      creator.put("Ruby", "Yukihiro Matsumoto");
	      creator.put("Java", "James Gosling");
	      creator.put("C", "Dennis Ritchie");
	      creator.put("PHP", "Rasmus Lerdorf");

	      
	      states = creator.keySet();   
	      Iterator itr = states.iterator();
	      
	      while(itr.hasNext()) 
	      {
	         str = (String) itr.next();
	         
	         System.out.println("author of " + str + " is " + creator.getProperty(str) + ".");
	      }     
	     

	      
	      str = creator.getProperty("Fortran", "Not Found");
	      
	      System.out.println("author of fortan " + str + ".");
		

	}

}
