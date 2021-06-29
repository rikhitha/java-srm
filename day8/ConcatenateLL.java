package day8.java.collections.com;

import java.util.LinkedList;
import java.util.Scanner;

class GetList
{
	public static void getelements()
	{
		int num;
		
		LinkedList<Integer> linkedList1 = new LinkedList<>();
		LinkedList<Integer> linkedList2 = new LinkedList<>();
		
        Scanner input = new Scanner (System.in);
		
		System.out.println("Enter Length of LinkedList 1:");
		
		int n1=input.nextInt();

		for (int i = 0; i < n1; i++){

		    System.out.println("Enter a number");
		    num = input.nextInt();
		    linkedList1.add(num);

		    
		}
		
        System.out.println("Enter Length of LinkedList 2:");
		
		int n2=input.nextInt();
		
		
		for (int i = 0; i < n2; i++){

		    System.out.println("Enter a number");
		    num = input.nextInt();
		    linkedList2.add(num);

		    
		}
		Concatenate cc=new Concatenate();
		cc.concat(linkedList1,linkedList2);
	}
}
class Concatenate
{
	public static void concat(LinkedList<Integer> list1,LinkedList<Integer> list2)
	{
		LinkedList<Integer> linkedList3 = new LinkedList<>();
		
		linkedList3.addAll(list1);
		linkedList3.addAll(list2);
		
		System.out.println("Linked List 1:"+" "+list1);
		System.out.println("Linked List 2:"+" "+list2);
		System.out.println("Linked List 1 + Linked List 2 ="+" "+linkedList3);
		
		
	}
}

public class ConcatenateLL 
{

	public static void main(String[] args) 
	{
		
		GetList gl=new GetList();
	    gl.getelements();
	}

}
