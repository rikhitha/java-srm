package converterspack;

import java.io.*;
import java.util.*;

public class currency
{
 int type;
double dollar,yen,euro,inr;

double val;

Scanner s=new Scanner(System.in);

public void fnRead()
{
System.out.println("enter type : ");
System.out.println("1.Dollar");
System.out.println("\n2.Euro");
System.out.println("3.Yen");
System.out.println("4.INR");
System.out.println("Enter option");
type=Integer.parseInt(s.nextLine().trim());
System.out.println("enter no of denominations");
val=Double.parseDouble(s.nextLine().trim());
}
public void fnConvert()
{

System.out.println("currency converison");

switch(type)
{
case 1:
inr=val*68.84;
System.out.println("Dollar="+val);
System.out.println("INR="+inr);
break;

case 2:
inr=val*80.90;
System.out.println("EURO="+val);
System.out.println("INR="+inr);
break;

case 3:
inr=val*0.62;
System.out.println("Yen="+val);
System.out.println("INR="+inr);
break;

case 4:
dollar=val/68.84;
euro=val/80.90;
yen=val/0.62;
System.out.println("INR="+val);
System.out.println("Dollar="+dollar);
System.out.println("EURO="+euro);
System.out.println("yen="+yen);

break;
default:
System.out.println("enter valid option");

}
}

}