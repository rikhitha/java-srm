package dayseven.java.files.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperLower  {

	public static void main(String[] args) throws Exception
	{
		BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\Files\\UpperLower.txt"));
		ArrayList<String> listOfLines = new ArrayList<>();
		String line = bufReader.readLine(); 
		while (line != null) 
		{
			listOfLines.add(line); 
		line = bufReader.readLine();
		}
		bufReader.close();
	
			
		
		System.out.println(listOfLines);
		
		
		
		File file = new File("C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\Files\\Upper.txt");
		
		
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(file))){
			listOfLines.stream().map(lines -> lines.toUpperCase()) .forEach(
					lines -> pw.println(lines)
					
					);

	           
	}
File file2 = new File("C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\Files\\Lower.txt");
		
		
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(file2))){
			listOfLines.stream().map(lines -> lines.toLowerCase()) .forEach(
					lines -> pw.println(lines)
					
					);

	           
	}
		System.out.println("Stored Files");

}
}
