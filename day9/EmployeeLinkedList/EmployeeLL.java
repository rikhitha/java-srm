package day9.java.hash.com;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



class Emp
{
	public static void print(LinkedList<EmployeeVal > linkedList1)
	{
		List<EmployeeVal > result1 = linkedList1.stream()
				 
			      .collect(Collector.toList());
			        
					 result1.forEach(p -> System.out.println("Employee no::"+p.getEno()+"\n "+"Employee Name::"+p.getEname()+"\n "+"Designation::"+p.getEdesignation()));
					 
		
	}
}

public class EmployeeLL implements BaseModel{

	public static void main(String[] args)
	{
		LinkedList<EmployeeVal > linkedList1 = new LinkedList<>();
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("enter num of records");
		
		int maxrec=scnr.nextInt();

		for (int j = 0; j <= maxrec; j++) 
		{

			EmployeeVal ob=new EmployeeVal();

			System.out.println("Enter Employee id:");
			ob.setEo(scnr.next());

			System.out.println("Enter Employee name:"+" ");
			ob.setname(scnr.next());

			System.out.println("Enter Employee Designation:");
			ob.setEdesignation(scnr.next());
			

			linkedList1.add(ob);
			
			
			
			
			

		}
		Emp em=new Emp();
		em.print(linkedList1);
	}

}
