import java.io.*;
import java.util.Scanner;
public class Q1
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
System.out.println("Enter the rows");
int rows = in.nextInt();
int   rowsval =2, val=1;
for(int i =0;i<rows;i++)
{
for(int j =1;j<rowsval;j++)
{
System.out.print(val +" ");
val++;
}
System.out.println("");
rowsval++;
}
}
}