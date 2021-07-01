package day10.collections.java.com;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import java.util.*;



public class BankTree 
{
	public static <K, V extends Comparable<V> > Map<K, V>
    valueSort(final Map<K, V> map)
    {
        
        Comparator<K> valueComparator = new Comparator<K>() {
            
                  
                  public int compare(K k1, K k2)
                  {
                      int comp = map.get(k1).compareTo(
                          map.get(k2));
                      if (comp == 0)
                          return 1;
                      else
                          return comp;
                  }
            
              };
        
        
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
        
        sorted.putAll(map);
        
        return sorted;
    }

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		  
        map.put(1000234, 20000);
        map.put(1000235, 4000);
        map.put(1000236, 30000);
        map.put(1000237, 53424);
        map.put(1000238, 12314);
  
        
        Map sortedMap = valueSort(map);
  
        
        Set set = sortedMap.entrySet();
  
        
        Iterator i = set.iterator();
  
        
        while (i.hasNext()) {
            
            Map.Entry mp = (Map.Entry)i.next();
            System.out.print(mp.getKey() + ": ");
            System.out.println(mp.getValue());
            
        }
        
		

	}

}
