package day13.strings.java.com;


class Replstr
{
	public static void find(String str,String r,String rep)
	{
		 System.out.println("String is::"+str);
		 
		 String replaced=str.replace(r, rep);
		 
		 System.out.println("String Replaced::"+replaced);
	}
}
public class ReplaceStr
{

	public static void main(String[] args) 
	{
		
		Replstr st=new Replstr();
		String str= "Multithreading";
		String torep="ing";
		String replace="ed";
		st.find(str,torep,replace);

	}

}
