package day10.collections.java.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionAlgorithms {

	public static void main(String[] args) 
	{
		
		ArrayList list = new ArrayList();
		PriorityQueue queue = new PriorityQueue();
		HashSet set = new HashSet();
		HashMap map = new HashMap();
		
		Random num = new Random();
		
		for(int i = 0; i < 5; i++) {
			list.add(num.nextInt(100));
			queue.add(num.nextInt(100));
			set.add(num.nextInt(100));
			map.put(i, num.nextInt(100));
		}
		
		System.out.println("List: " + list);
		System.out.println("Queue: " + queue);
		System.out.println("Set : " + set);
		System.out.println("Map: " + map);
		
		Collections.sort(list);
		System.out.println("List in ascending order => " + list);
		
		System.out.println("Largest element in set => " + Collections.max(set));
		
		System.out.println("Smallest element in queue => " + Collections.min(queue));
		
		Collections.reverse(list);
		System.out.println("List in reverse order => " + list);
		
		Collections.shuffle(list);
		System.out.println("List after shuffle => " + list);
		

	}

}
