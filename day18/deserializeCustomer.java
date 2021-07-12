package day18.netwrkng.java.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserializeCustomer {

	public static void main(String[] args) 
	{
		CustomerDetails cd = null;
	      try 
	      {
	         FileInputStream fileIn = new FileInputStream("C:\\Users\\HP\\Desktop\\se.txt");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         cd = (CustomerDetails) in.readObject();
	         in.close();
	         fileIn.close();
	      } 
	      catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } 
	      catch (ClassNotFoundException c) 
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + cd.name);
	      System.out.println("Address: " + cd.address);
	      System.out.println("Account Number: " + cd.accountnumber);
	      System.out.println("Number: " + cd.number);


	}

}
