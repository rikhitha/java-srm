package converterspack;

import java.io.*;
import java.util.*;

public class distance
{
 int type;

 double meter,km,miles;

double val;

 Scanner s=new Scanner(System.in);
  
 public void fnRead()
{
System.out.println("enter type");
System.out.println("1.meter");
System.out.println("2.miles");
System.out.println("3.km");
System.out.println("enter option");
type=Integer.parseInt(s.nextLine().trim());
System.out.println("enter value to be converted");
val=Double.parseDouble(s.nextLine().trim());

}

public void fnConvert()
{
System.out.println("Distance conversion");

switch(type)
{
case 1: km=val/1000;
System.out.println("meter="+val);
System.out.println("km="+km);
break;

case 2:km=val/0.621371;
System.out.println("miles="+val);
System.out.println("km="+km);
break;

case 3:meter=val*1000;
meter=val*0.621371;
System.out.println("km="+val);
System.out.println("meter="+meter);
System.out.println("miles=");

break;

default:
System.out.println("enter valid option");
}
}


}