package day12.legacy.java.com;

import java.util.ArrayList;
import java.util.Scanner;

class getAList
{
	public static void getA()
	
	{
        Integer val;
		
		ArrayList<Integer> array = new ArrayList<Integer> ();

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter Length of ArrayList:");
		
		int n=input.nextInt();

		for (int i = 0; i < n; ++i){

		    System.out.println("Enter value");
		    val = input.nextInt();
		    array.add(val);

		    
		}
		System.out.println(array);
		
		
		Listfront ll=new Listfront();
		
		ll.listit(array);
	}
}

class Listfront
{
	public static void listit(ArrayList<Integer> list)
	{
		System.out.println("updated arraylist");
		
		int min = list.get(0);
	    int i, id = 0;
	    for (i = 1; i < list.size(); i++) {
	        if (list.get(i) < min) {
	            min = list.get(i);
	            id = i;
	        }
	    }
	    list.add(0, list.remove(id));
	    System.out.println(list);
	}
}

public class minFront 
{

	public static void main(String[] args)
	{
		
         getAList al=new getAList();
		
		al.getA();
    
	}

}
