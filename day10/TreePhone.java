package day10.collections.java.com;

import java.util.TreeMap;

public class TreePhone 
{
	static TreeMap<Integer, String> tm;
	  
   
    static void create()
    {
        
        tm= new TreeMap<Integer, String>();
  
        
    }
  
    
    static void insert()
    {
        
        tm.put(781738342, "Rikitha");
        tm.put(751234567, "Manoj");
        tm.put(989878673, "Kumar");
        
    }
  
    
    static void search(int key)
    {
  
    	
        
        System.out.println( key + " present in"+ tm.containsKey(key));
    }
  
    
    static void search(String value)
    {
  
        
        System.out.println(value + "\" present in "+ tm.containsValue(value));
    }
  
   
    
    
    
  

	public static void main(String[] args) 
	{
		
		create();
		  
        
        insert();
  
        
        search(781738342);
  
        
        search("Manoj");
	}

}
