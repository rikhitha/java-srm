package day5.files.java.code.com;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

        
		int bp;
		int empid;
		String empname;
        
        System.out.println("enter Employee name:");
        
        empname=sc.next();
        
        System.out.println("Enter employee id");
        
        empid=sc.nextInt();
        
        System.out.println("enter Basic Pay");
        
        bp=sc.nextInt();
         
       
          try
        {
        	
             if(bp<=20000)
                   {
                 throw new PayOutOfBoundsException(); 
                   }
             else
             {
             Employee emp = new Employee(bp,empname,empid);
        emp.display();
             }

               
                    
                  
        }
        catch(PayOutOfBoundsException e1)
        {
             System.out.println(e1);
        }
		

	}

}
