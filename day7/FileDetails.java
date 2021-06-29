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

class CanRead
{
	public static void fileread(File f)
	{
		System.out.println("File is readable:: "+f.canRead());
	}
}

class CanWrite
{
	public static void filewrite(File f)
	{
		System.out.println("File is writable::"+f.canWrite());	
	}
}

class GetType

{
	public static void filetype(File f)
	{
            String fileName = f.toString();
        
		String extension="" ;
		
	    int index = fileName.lastIndexOf('.');
	    if(index > 0) 
	    {
	      extension = fileName.substring(index + 1);
	      System.out.println("File Type:: " + extension);
	      
	    }
		
	}
}

class GetLength
{
	public static void filelength(File f)
	{
		System.out.println("Length of the file:: "+f.length()+" bytes");
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
		
		FileName fn=new FileName();
		fn.filename(f);
		
		CanRead cr=new CanRead();
		cr.fileread(f);
		
		CanWrite cw=new CanWrite();
		cw.filewrite(f);
		
		GetType gt=new GetType();
		gt.filetype(f);
		
		GetLength gl=new GetLength();
		gl.filelength(f);
			

	}

}
