package day13.strings.java.com;

class Vowel
{
	public static void countVowels(String data)
	{
		int count =0;
		
		
	      
	      String str = data.toLowerCase();  
	      
	      for(int i = 0; i < str.length(); i++)
	      {
	    	  if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
	    	  {
	    		  count++;
	    	  }
	      }
	      System.out.println("Number of vowels:: " +count);
	}
}
public class Vowels {

	public static void main(String[] args) 
	{
		Vowel v=new Vowel();
		String st="NoOfVowelsInGivenString";
		v.countVowels(st);
		

	}

}
