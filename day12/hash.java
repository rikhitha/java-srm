package day12.legacy.java.com;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

class setval
{
	public static void val()
	{
		Hashtable<String, String> creator = new Hashtable<>();
	creator.put("Python", "Guido van Rossum");
    creator.put("Ruby", "Yukihiro Matsumoto");
    creator.put("Java", "James Gosling");
    creator.put("C", "Dennis Ritchie");
    creator.put("PHP", "Rasmus Lerdorf");
    
    Iter obj=new Iter();
    obj.iteranteval(creator);
    
	}
}
class Iter
{
	public static void iteranteval(Hashtable<String, String> ht)
	{
		String p;
		Set<String> keys = ht.keySet();
		
		Iterator<String> i = keys.iterator();
		
		while (i.hasNext()) { 
		       
		       p = i.next();

		       
		       System.out.println("Author of "+p+"  is  "+ht.get(p));
		    } 
	}
}
public class hash {

	public static void main(String[] args) 
	{
		setval sv=new setval();
		sv.val();

	}

}
