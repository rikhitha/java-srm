package dayseven.java.files.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Words
{
	public static void countWords(String[] data)
	{
		int count =0;
		for (int i=0; i<data.length; i++)
	      {
	         count++;
	      }
	      System.out.println("Number of words in the given file are:: " +count);
	}
}
class Vowels
{
	public static void countVowels(String[] data)
	{
		int count =0;
		
		StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < data.length; i++) {
	         sb.append(data[i]);
	      }
	      String str = sb.toString();
	      System.out.println(str);
	      
	      str = str.toLowerCase();  
	      
	      for(int i = 0; i < str.length(); i++)
	      {
	    	  if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
	    	  {
	    		  count++;
	    	  }
	      }
	      System.out.println("Number of words in the given file are:: " +count);
	}
}
public class CountCharVow {

	public static void main(String[] args) throws IOException 
	{
		
	      File file = new File("C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\Files\\File.txt");
	      
	      FileInputStream fis = new FileInputStream(file);
	      
	      byte[] bytesArray = new byte[(int)file.length()];
	      
	      fis.read(bytesArray);
	      
	      String s = new String(bytesArray);
	      
	      String [] data = s.split(" ");
	      
	      Words wd=new Words();
	      
	      wd.countWords(data);
	      
	      Vowels vw= new Vowels();
	      
	      vw.countVowels(data);
	      
	      

	}
}
