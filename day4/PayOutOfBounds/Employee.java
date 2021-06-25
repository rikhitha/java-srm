package day5.files.java.code.com;

public class Employee 
{

	int bp;
	int empid;
	int epf;
    String empname;

    Employee(int bp,String empname,int empid)
    {
          this.bp=bp;
          this.empname=empname;
          this.empid=empid;
              
    }
    double epf()
    {
    	epf=(12*bp)/100;
    	return epf;
    	
    	
    }
    void display()
    {
    	
         System.out.println("Employee Id::"+empid);
         System.out.println("Employee Name::"+empname);
         System.out.println("Basic Pay::"+bp);
         System.out.println("EPf is"+epf());

    }

}
