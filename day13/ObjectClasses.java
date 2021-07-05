package day13.strings.java.com;

public class ObjClass 
{

	public static void main(String[] args) 
	{
		Object o = new String("DemonstrateObjectClass");
		
        Class c = o.getClass();
        
        System.out.println("Class of Object is : "+ c.getName());
	}

}
