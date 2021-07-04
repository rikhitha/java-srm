package day12.legacy.java.com;

import java.util.Scanner;
import java.util.TreeSet;

class Arraydup
{
	public static void getar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array::");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements :");
		for (int y=0;y<n;y++)
		{
			arr[y]=sc.nextInt();
		}
		
		sc.close();
		FindDup fd=new FindDup();
		fd.duplicates(arr);
	}
}
class FindDup
{
	public static void duplicates(int array[])
	{
		TreeSet<Integer> s = new TreeSet<Integer>();
		
		for(Integer v:array)
	        {
	            if(!s.add(v))
	            {
	                System.out.println("Duplicate Entry is: "+v);
	            }
	        }
		Object[] ar=s.toArray();
		System.out.println("unique array :");
		for(int h=0;h<ar.length;h++)
		{
			System.out.println(ar[h]);
		}
	}
}

public class arrDuplicateTreeset 
{

	public static void main(String[] args) 
	{
		Arraydup ar=new Arraydup();
		ar.getar();
		
      
	}

}
