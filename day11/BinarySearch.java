package day11.comparator.java.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class arraysearch
{
	public static void arraysearch()
	
	{
		Scanner s = new Scanner(System.in);
		int[] q =new int[5];
		 
		
		
		
		System.out.println("elements:");
        for(int i = 0; i < q.length; i++)
        {
            q[i] = s.nextInt();
        }
        
        int qkey = 22;
        System.out.println(qkey + "index ="+Arrays.binarySearch(q,qkey));
		
	}
}

public class Search
{

	public static void main(String[] args)
	{
		arraysearch al=new arraysearch();
		
		al.arraysearch();

	}

}
