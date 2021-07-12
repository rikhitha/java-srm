package day19.reflection.java.com;

import java.lang.reflect.Modifier;

class Base {
}

class Dog extends Base {
	  public void display() {
	    System.out.println("I am a dog.");
	  }
	}
public class Reflection
{

	public static void main(String[] args) 
	{
		try {
		      
		      Dog d1 = new Dog();

		      
		      
		      Class obj = d1.getClass();

		      
		      String name = obj.getName();
		      System.out.println("Name: " + name);

		      
		      int modifier = obj.getModifiers();

		      
		      String mod = Modifier.toString(modifier);
		      System.out.println("Modifier: " + mod);

		      
		      Class superClass = obj.getSuperclass();
		      System.out.println("Superclass: " + superClass.getName());
		    }

		    catch (Exception e) {
		      e.printStackTrace();
		    }
		  }
	

}
