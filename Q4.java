import java.io.*;
import java.util.Scanner;
public class Q4
{
public static void main(String args[])
{

Scanner in = new Scanner(System.in);
System.out.println("Enter the array size");
int len = in.nextInt();
//int[] array = new int[len];
int[] array  =new int[len];
int[] sortedindex = new int[len];
for(int i=0;i<array.length;i++)
array[i]=in.nextInt();
                                                                                                                 
int digit,sum=0,n;
for(int j =0;j<array.length;j++) {                             //Find sum
n=array[j];
while(n>0)
{
digit =n%10;
sum+=digit;
n=n/10;
}
sortedindex[j]=sum;
sum=0;
}
for(int j =0;j<10;j++) {                                                  //sort the Array   
for(int i=0;i<array.length-1;i++) {
if(sortedindex[i]>sortedindex[i+1]) {
int temp = sortedindex[i];
sortedindex[i]=sortedindex[i+1];
sortedindex[i+1]=temp;
temp = array[i];
array[i]=array[i+1];
array[i+1]=temp;
}
}
}
for(int i=0;i<array.length-1;i++)
{
if(sortedindex[i]==sortedindex[i+1])
{
if(array[i]>array[i+1])
{
int tem = array[i];
array[i]=array[i+1];
array[i+1]=tem;
}
}
}
System.out.println("After Sorted .....");
for(int j:array)
System.out.print(j+"  | " );
}
}









