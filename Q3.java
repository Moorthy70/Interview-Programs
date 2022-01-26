import java.io.*;
import java.util.Scanner;
public class Q3
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
System.out.println("Enter the Primary array size");
int size =in.nextInt();
int[] primary = new int[size]; 
System.out.println("Enter the Sub array size");
size =in.nextInt();
int[] sub = new int[size];          //declare array
int[] index =new int[sub.length];

System.out.println("Enter the Primary array Values");
for(int i =0;i<primary.length;i++)
{
int val =in.nextInt();
primary[i]=val;
}     //primary array
System.out.println("Enter the Sub array Values");
for(int i =0;i<sub.length;i++)
{
int val =in.nextInt();
sub[i]=val;
}     //sub array
boolean present =false;
//Check sub array and primary array
for(int sb =0;sb<sub.length;sb++)
{
present =false;
for(int pr =0;pr<primary.length;pr++)
{
if(sub[sb]==primary[pr])
{
present =true;
index[sb]=pr;
}
}
if(present==false)
{
System.out.println("Sub array cannot be constructed from primary array");
break;
}
}
if(present ==true)
{
System.out.print("Required indices = ");
for(int req : index)
System.out.print(req +" ");
}
}
}




