package day12.legacy.java.com;

import java.util.ArrayList;
import java.util.Scanner;

class getArrayList
{
	public static void getArrayList()
	
	{
        String val;
		
		ArrayList<String> array = new ArrayList<String> ();

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter Length of ArrayList:");
		
		int n=input.nextInt();

		for (int i = 0; i < n; ++i){

		    System.out.println("Enter string");
		    val = input.next();
		    array.add(val);

		    
		}
		System.out.println(array);
		
		
		Listiter ll=new Listiter();
		
		ll.listit(array);
	}
}

class Listiter
{
	public static void listit(ArrayList<String> array)
	{
		System.out.println("ArrayList with Odd Length Strings");
		for(int g=0;g<array.size();g++)
		{
		if(!(array.get(g).length() % 2== 0))
		{
			System.out.println(array.get(g));
		}
		}
	}
}
public class RemoveEven {

	public static void main(String[] args)
	{
       getArrayList al=new getArrayList();
		
		al.getArrayList();

	}

}