package day12.legacy.java.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



class Student {

	    
	   String name;    
	int age;    
	     
	  
	    public String getName() {  
	        return name;  
	    }  
	  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	  
	    public int getAge() {  
	        return age;  
	    }  
	  
	    public void setAge(int age) {  
	        this.age = age;  
	    } 
	    @Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}

}



class HashString
{
	public static void hString()
	{
		HashSet<String> h = new HashSet<String>();
		
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("1. String objects");
		
		System.out.println("enter size");
		
		int s=sc.nextInt();
		
		System.out.println("Enter strings");
		
		for(int d=0;d<s;d++)
		{
			String str=sc.next();
			h.add(str);
		}
		
		IterStr is=new IterStr();
		is.print(h);
		
	}
}

class IterStr
{
	public static void print(HashSet<String> h)
	{
		
		System.out.println(". String objects:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
    }
        HashInt hi=new HashInt();
        hi.hSInt();
	}
}
class HashOwnObj
{
	public static void hObj()
	{
		HashSet<Student> h = new HashSet<Student>();
		
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Own object (Student)");
		
		System.out.println("enter num of records");
		
		int maxrec=scnr.nextInt();

		for (int j = 0; j <= maxrec; j++) 
		{

			Student ob=new Student();

			System.out.println("Enter stuednt name:");
			ob.setName(scnr.next());

			System.out.println("Enter student age:"+" ");
			ob.setAge(scnr.nextInt());

			
			

			h.add(ob);
			
			
			
			
			

		}
		StudentPrint sp=new StudentPrint();
		sp.print(h);
	}
}

class StudentPrint
{
	public static void print(HashSet<Student> h)
	{
		
			        
					 h.forEach(p -> 
					 System.out.println("Student Name::"+p.getName()+"\n "+"Student Age::"+p.getAge()));
	}
}
class HashInt
{
	public static void hSInt()
	{
     HashSet<String> h = new HashSet<String>();
		
		Scanner sc=new Scanner(System.in);		
		
		System.out.println("2. Integer objects");
		
		System.out.println("enter size");
		
		int sz=sc.nextInt();
		
		System.out.println("Enter integers");
		
		for(int k=0;k<sz;k++)
		{
			String str=sc.next();
			h.add(str);
		}
		
		IterInt ii=new IterInt();
		ii.print(h);
	}
}
class IterInt 
{
	public static void print(HashSet<String> h)
	{
		
		System.out.println("Integer objects:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
    }
        HashOwnObj ho=new HashOwnObj();
        ho.hObj();
	}
}
public class HashObjcts
{

	public static void main(String[] args) 
	{
		HashString hs=new HashString();
		hs.hString();
		
	}

}
