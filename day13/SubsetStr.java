package day13.strings.java.com;


class Substr
{
	public static void find(String str)
	{
		 int len = str.length();  
	        int temp = 0;  
	         
	        String arr[] = new String[len*(len+1)/2];  
	  
	        
	        for(int i = 0; i < len; i++) {  
	           
	            for(int j = i; j < len; j++) {  
	                arr[temp] = str.substring(i, j+1);  
	                temp++;  
	            }  
	        }  
	        System.out.println("subsets for string : ");  
	        for(int i = 0; i < arr.length; i++) {  
	            System.out.println(arr[i]);  
	        }  
		
	}
}
public class SubsetStr
{

	public static void main(String[] args) 
	{
		
		Substr st=new Substr();
		String str= "Synchronization";
		st.find(str);

	}

}
