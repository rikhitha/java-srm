package day18.netwrkng.java.com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableCustomer {

	public static void main(String[] args) 
	{
		CustomerDetails customerobject = new CustomerDetails();
		customerobject.name = "Rema";
		customerobject.address = "Nirmal street,Anna nagar";
		customerobject.accountnumber = 11122333;
		customerobject.number = 101;
	      
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("C:\\Users\\HP\\Desktop\\se.txt");
	         
	         
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(customerobject);
	         
	         
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}

}
