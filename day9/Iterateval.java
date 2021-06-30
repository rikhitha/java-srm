package day9.java.hash.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;




class getArrayList
{
	public static void getArrayList()
	
	{
        int num;
		
		ArrayList<Integer> array = new ArrayList<Integer> ();

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter Length of ArrayList:");
		
		int n=input.nextInt();

		for (int i = 0; i < n; ++i){

		    System.out.println("Enter a number");
		    num = input.nextInt();
		    array.add(num);

		    
		}
		System.out.println(array);
		
		Iter i=new Iter();
		i.iterateFun(array);
		Listiter ll=new Listiter();
		ll.listit(array);
	}
}
class Iter
{
	public static void iterateFun(ArrayList<Integer> array)
	{
		System.out.println("Using iterator");
		Iterator it = array.iterator();
	      while (it.hasNext()) {
	         System.out.println(it.next());
	      }
	      
	      
	      
	      
	      }
}
class Listiter
{
	public static void listit(ArrayList<Integer> array)
	
	{
		System.out.println("Using ListIterator");
		ListIterator it = array.listIterator();
	      System.out.println("Iterating the elements in forward direction: ");
	      while (it.hasNext()) {
	         System.out.println(it.next());
	      }
	      System.out.println("--------------------------------------------");
	      System.out.println("Iterating the elements in backward direction: ");
	      while (it.hasPrevious()) {
	         System.out.println(it.previous());
	      
	      }
		
	}
}
public class Iterateval 
{

	public static void main(String[] args) 
	{
     
        getArrayList al=new getArrayList();
		
		al.getArrayList();
		
	      }
}
