package day10.collections.java.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comapratorSort {

	public static void main(String[] args) 
	{
		ArrayList<Student> al=new ArrayList<Student>();    
		  al.add(new Student(709,"jay",23));    
		  al.add(new Student(788,"Ajit",27));    
		  al.add(new Student(007,"Jji",21));  
		  
		  Comparator<Student> cm1=Comparator.comparing(Student::getName); 
		  
		  Collections.sort(al,cm1);  
		  
		   System.out.println("Sorting by Name");  
		   
		   for(Student st: al)
		   {  
		     System.out.println(st.rollno+" "+st.name+" "+st.age); 
		     
		     }  
		   
		    Comparator<Student> cm2=Comparator.comparing(Student::getAge);  
		Collections.sort(al,cm2);  
		
		   System.out.println("Sorting by Age"); 
		   
		   for(Student st: al)
		   {  
		     System.out.println(st.rollno+" "+st.name+" "+st.age);  
		     
		     }    

	}

}
