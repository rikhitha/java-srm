package day8.java.collections.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class getArrayL
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
		
		ReplaceElement re =new ReplaceElement();
		re.replace(array);
		
		
	}
}
class ReplaceElement 
{
	
	
	public static void replace(ArrayList<Integer> arrayList)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index at which element has to be replaced");
		int index=sc.nextInt();
		
		System.out.println("Enter element to be replace");
		int replaced=sc.nextInt();
		
		arrayList.set(index,replaced);
		
		System.out.println("Element "+index+" "+"in ArrayList replaced with"+" "+replaced);
		
		System.out.println(arrayList);
		
		
		
	}
}
public class ReplaceArrayList {

	public static void main(String[] args) 
	{
		
		getArrayL gl=new getArrayL();
		gl.getArrayList();

	}

}
