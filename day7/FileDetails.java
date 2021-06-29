package dayseven.java.files.com;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

class Filexists
{
	public static void exists(File f)
	{
		System.out.println("File exists:: "+f.exists());
	}
}
class FileName
{
	public static void filename(File f)
	{
		System.out.println("File name::"+f.getName());
	}
}


public class FileDetails 
{
	//C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\Files\\File.txt

	public static void main(String[] args) throws IOException 
	{
		String filename = JOptionPane.showInputDialog("Enter filename: ");
		
		File f = new File(filename);
		
		Filexists fe=new Filexists();
		fe.exists(f);
		
		
		
		String fileName = f.toString();
        
		String extension="" ;
		
	    int index = fileName.lastIndexOf('.');
	    if(index > 0) 
	    {
	      extension = fileName.substring(index + 1);
	      
	      
	    }
	    
		
		System.out.println("File name::"+f.getName());
		
		System.out.println("File is readable:: "+f.canRead());
		
		System.out.println("File is writable::"+f.canWrite());
		
		System.out.println("File Type:: " + extension);
		
		System.out.println("Length of the file:: "+f.length()+" bytes");
		
		
		

	}

}
