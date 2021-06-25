package day5.files.java.code.com;

public class Student 
{

	int rollnum,marks;
    String name;

    Student(int rollnum,String name,int marks)
    {
          this.rollnum=rollnum;
          this.name=name;
          this.marks=marks;
              
    }
    void display()
    {
         System.out.println("Name::"+name);
         System.out.println("Roll Number::"+rollnum);
         System.out.println("Marks::"+marks);

    }

}
