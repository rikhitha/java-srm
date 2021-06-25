package day5.files.java.code.com;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

        
        int rollnum;
        int marks;
        String name;
        
        System.out.println("enter rollnum:");
        
        rollnum=sc.nextInt();
        
        System.out.println("rollnum"+rollnum);
        
        System.out.println("enter name");
        
        name=sc.next();
        
        System.out.println("name"+name);
        
        System.out.println("enter marks");
        
        marks=sc.nextInt();
       
          try
        {
        	
             if(marks<=0 || marks>=101)
                   {
                 throw new MarkNotWithInRangeException(); 
                   }
             else
             {
             Student s = new Student(rollnum,name,marks);
        s.display();
             }

               
                    
                  
        }
        catch(MarkNotWithInRangeException e1)
        {
             System.out.println(e1);
        }
		

	}

}
