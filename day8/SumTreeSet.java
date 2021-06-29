package day8.java.collections.com;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class GetTreeSet
{
	public static void getTreeval()
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
	    
	    
	    Scanner input = new Scanner (System.in);
		
		System.out.println("Enter Length of TreeSet:");
		
		int n1=input.nextInt();
		
		int num;

		for (int i = 0; i < n1; i++)
		{

		    System.out.println("Enter element to add in Treeset");
		    num = input.nextInt();
		    ts.add(num);

		   }
		System.out.println("Elements in TreeSet : "+ts);
		ForSum fs=new ForSum();
		fs.sumfor(ts);
		
		WhileSum ws=new WhileSum();
		ws.whileSum(ts);
		
		RecursionSum rs=new RecursionSum();
		rs.recSum(ts);
		
	}
}
class ForSum
{

	public void sumfor(TreeSet<Integer> ts) 
	{
		int sum=0;
	    
	    for (Integer value : ts)
	    {
	    	sum=sum+value;
	        
	    }
	    System.out.println("Sum of TreeSet Using for : "+sum);
		
		
	}
}
class WhileSum
{

	public void whileSum(TreeSet<Integer> ts) 
	{
		int result=0;
	    Iterator<Integer> itr = ts.iterator();
	    while(itr.hasNext())
	    {
	    
	    	int g=itr.next();
	    	result=result+g;
	    	
	    }
	    System.out.println("Sum of TreeSet using While : "+result);
		
	}
}
class RecursionSum
{
	

	public void recSum(TreeSet<Integer> ts) 
	{
		int n = ts.size(); 
        int arr[] = new int[n]; 
        
        int i = 0; 
        
        for (int ele : ts) 
            arr[i++] = ele; 
        
        int sum=cal(arr,arr.length);
        System.out.println("Sum Of TreeSet using Recursion : "+sum);
		
		
	}

	private static int cal(int arr[], int n)
	{
		if (n <= 0) {
            return 0;
          }
 
          
          return cal(arr, n-1 ) + arr[n-1];
		
		
	}
}
public class SumTreeSet 
{


	public static void main(String[] args) 
	{
		GetTreeSet gts=new GetTreeSet();
		gts.getTreeval();
	}
}
		
    



    
    
    
		

		
		
		
            
        
        
     
