package day11.comparator.java.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class getArray
{
	public static void getArray()
	
	{
		Scanner s = new Scanner(System.in);
		int[] q =new int[5];
		 
		
		
		
		System.out.println("Enter all the elements:");
        for(int i = 0; i < q.length; i++)
        {
            q[i] = s.nextInt();
        }
        Arrays.sort(q);
  
        System.out.println("Sorted array");
        for(int i=0;i<q.length;i++)
        {
        	System.out.println(q[i]);
        }
        	
		
	}
}

public class Sort
{

	public static void main(String[] args) 
	{
       getArray al=new getArray();
		
		al.getArray();
		

	}

}
