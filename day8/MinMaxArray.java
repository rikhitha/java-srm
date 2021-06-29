package day8.java.collections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		
		MinMaxMethod mmm=new MinMaxMethod();
		mmm.builtin(array);
		
		MinMaxDefined mmd=new MinMaxDefined();
		mmd.defined(array);
	}
}
class MinMaxMethod
{
	public static void builtin(List<Integer> arrayList)
	{
       System.out.println("Max Min using Collections.max and Collections.min");
		
		int max = Collections.max(arrayList);
		int min = Collections.min(arrayList);
		
		System.out.println("Maximum in ArrayList"+max );
		System.out.println("Minimum in ArrayList"+min );
		
	}
}
class MinMaxDefined
{
	public static void defined(List<Integer> arrayList)
	{
       System.out.println("\nMax Min using loop");
		
       int minIndex = 0, maxIndex = 0;
       
       int min = arrayList.get(0);
       int max = arrayList.get(0);
       
       for(int i = 1; i < arrayList.size(); i++ ){
   
            
           
           if( arrayList.get(i) < min )
           {
               min = arrayList.get(i);
               minIndex = i;
           }
           
           
           
           
           if( arrayList.get(i) > max ){
               max = arrayList.get(i);
               maxIndex = i;
           }

       }
		
		System.out.println("Maximum in ArrayList"+max );
		System.out.println("Minimum in ArrayList"+min );
		
	}
}

public class MinMaxArrayList
{

	public static void main(String[] args) 
	{
		
		getArrayList al=new getArrayList();
		
		al.getArrayList();
		
		
		

	}

}
