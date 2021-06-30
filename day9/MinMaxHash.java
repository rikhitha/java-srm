package day9.java.hash.com;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GetHashMap
{
	public static void  hashVal()
	{
		HashMap<Integer,String> hmap = new HashMap<Integer,String> ();
      
		Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) 
        {
        	System.out.println("Enter Key:");
            Integer a = in.nextInt();
            System.out.println("Enter Value:");
            String b = in.next();

            hmap.put(a, b);
        }

        for (Map.Entry<Integer, String> m : hmap.entrySet()) 
        {
            System.out.println("Key::"+m.getKey() + " " +"Value::"+ m.getValue());
        }
		
		
        MinMaxH mm=new MinMaxH();
        mm.minmax(hmap);
	}
}

class MinMaxH
{
	public static void minmax(HashMap<Integer,String> map)
	{
		
        int maxKey = Collections.max(map.keySet());
  
        System.out.println("maximum key of map is: " + maxKey);
        
        String minValue = Collections.min(map.values());
        
        System.out.println("minimum value of map is: "+ minValue);
        
	}
}
public class MinMaxHash {

	public static void main(String[] args) 
	{
        GetHashMap al=new GetHashMap();
		
		al.hashVal();

	}

}
