package dayseven.java.files.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile 
{

	public static void main(String[] args) 
	{
		byte[] array = new byte[50];
	    try {
	      FileInputStream sourceFile = new FileInputStream("C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\Files\\File.txt");
	      
	      FileOutputStream destFile = new FileOutputStream("C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\Files\\File2.txt");

	      
	      
	     
	      sourceFile.read(array);

	      
	      destFile.write(array);
	      System.out.println("The file is copied to newFile.");

	      
	      sourceFile.close();
	      destFile.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
	}

}
