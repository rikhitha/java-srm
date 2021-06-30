package day9.java.hash.com;

import java.util.ArrayDeque;
import java.util.Scanner;
class oper
{
	public static void fun(ArrayDeque<Integer> stack)
	{
System.out.println("Current element at the top of the stack: " + stack.peek());

        
        System.out.println("Element popped from the stack: " + stack.pop());

        
        System.out.print("Current elements in the stack: ");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
	}
}

public class Dequec 
{
    public static void main(String[] args) {

         
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        
Scanner input = new Scanner (System.in);
		
int num;
		System.out.println("Enter Length of ArrayDeque:");
		
		int n=input.nextInt();

		for (int i = 0; i < n; ++i){

		    System.out.println("Enter a number");
		    num = input.nextInt();
		    stack.push(num);

		    
		}
		System.out.println(stack);

        
        oper op=new oper();
        op.fun(stack);

        
        
        

       
    }
}