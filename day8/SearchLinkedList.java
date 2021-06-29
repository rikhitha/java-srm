package day8.java.collections.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class GetLinkedList
{
	public static void getelements()
	{
		int num;
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		
        Scanner input = new Scanner (System.in);
		
		System.out.println("Enter Length of LinkedList:");
		
		int n=input.nextInt();

		for (int i = 0; i < n; i++){

		    System.out.println("Enter a number");
		    num = input.nextInt();
		    linkedList.add(num);

		    
		}
		System.out.println(linkedList);
		Search sc=new Search();
		sc.searchElement(linkedList);
	}
}
class Search
{
	public static void searchElement(LinkedList<Integer> list)
	{
		ArrayList<Integer> occurIndex=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element to find the occurance");
		int searchele=sc.nextInt();
		int inc=0;
		
		for (int i = 0; i < list.size(); i++) 
		{
			if(list.get(i)==searchele)
			{
				inc++;
				occurIndex.add(i);
			}
			
			
		}
		System.out.println("element"+" "+searchele+" "+"occured in Linked list"+" "+inc+" "+"times.At the positions"+occurIndex);
            
	}
}
public class SearchLinkedList 
{

	public static void main(String[] args) 
	{
		GetLinkedList ll=new GetLinkedList();
		ll.getelements();
		
	

	}

}
