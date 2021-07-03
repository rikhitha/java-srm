package day11.comparator.java.com;

import java.util.Scanner;

class HashTable
{
    int[] arr;
    int cap;
 
    
    public HashTable(int capacity)
    {
        this.cap = nextPrime(capacity);
        arr = new int[this.cap];
    }
 
   
    public void insert(int ele)
    {
        arr[ele % cap] = ele;
    }
 
    
    public void clear()
    {
        arr = new int[cap];
    }
 
    
    public boolean contains(int ele)
    {
        return arr[ele % cap] == ele;
    }
 
    
    public void delete(int ele)
    {
        if (arr[ele % cap] == ele)
            arr[ele % cap] = 0;
        else
            System.out.println("not found");
    }
 
   
    private static int nextPrime( int n )
    {
        if (n % 2 == 0)
            n++;
        for (; !isPrime(n); n += 2);
 
        return n;
    }
 
    
    private static boolean isPrime(int n)
    {
        if (n == 2 || n == 3)
            return true;
        if (n == 1 || n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
 
    
    public void printTable()
    {
        
        for (int i = 0; i < cap; i++)
        {
        	
            System.out.print(arr[i] +" ");
        }
        
    }
}
public class HashTableTest {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Hash Table Test\n\n");
        System.out.println("Enter size");
        
        HashTable ht = new HashTable(scan.nextInt() );
 
        char ch;
        
        do    
        {
            System.out.println("\nHash Table Operations\n a.insert b.remove c.constains d.clear");
                       
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("element to insert");
                ht.insert( scan.nextInt() ); 
                break;                          
            case 2 :                 
                System.out.println("element to delete");
                ht.delete( scan.nextInt() ); 
                break;                        
            case 3 : 
                System.out.println("showing contains");
                System.out.println("contains : "+ ht.contains(scan.nextInt() ));
                break;                                   
            case 4 : 
                ht.clear();
                System.out.println("Cleared");
                break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            
            ht.printTable();  
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');  

	}

}
