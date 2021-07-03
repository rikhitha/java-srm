class vec
{
  public static void main(String args[])
  {
    Vector<Integer> v1add = new Vector<Integer>();
    
    Vector<Integer> v2add = new Vector<Integer>();
    
    Scanner s=new Scanner(System.in);
    
    int n1=s.nextInt();
    
    System.out.println("enter elements for v1");
    for (int i=0i<=n1;i++)
    {
      v1.add(v1.set(i))
    }
    int n2=s.nextInt();
    
    System.out.println("enter elements for v1");
    for (int i=0i<=n2;i++)
    {
      v2.add(i);
    }
    System.out.println("vector addiotn");
    System.out.println(vecdd(v1,v2));
    
     System.out.println("vector Multiplication");
    System.out.println(vecmul(v1,v2));
  }
static void vecadd(Vector<Integer> v1,Vector<Integer> v2)
{
  int sum=0;
  for(int i=0;i<v1.length;i++)
  {
    for(int j=0;j<v2.length;j++)
    {
    sum=sum+v1.get(i)+v2.get(i);
    }
    System.out.println(sum);
  }
  static void vecmul(Vector<Integer> v1,Vector<Integer> v2)
{
  
    Vector<Integer> v = new Vector<Integer>();
  
    v.get(0)=v1.get(1)*v2.get(2)-v1.get(2)*v2.get(1);
    
     v.get(1)=v1.get(2)*v2.get(0)-v1.get(0)*v2.get(2);
    
     v.get(2)=v1.get(0)*v2.get(1)-v1.get(1)*v2.get(0);
    
   
  }
  
}
}
