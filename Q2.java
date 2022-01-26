import java.io.*;
import java.util.Scanner;
public class Q2 
{
public static void main(String args[])
{
Scanner in= new Scanner(System.in);
Q2 obj = new Q2();
for(int i=1;i<=3;i++)
{
System.out.println("Enter the " +i+ " element");
int element =in.nextInt();
obj.sum(element);
}
}
public void sum(int n)
{
int odd=0,even=0,digit;
int count =Countofdigits(n);      //Count of digits in the given value
for(int i =count;i>0;i--)
{
digit = n%10;
if(i%2!=0)
{
odd =digit+odd*10;
}
else
{
even = digit+even*10;
}
n=n/10;
}
int odd1 =reverse(odd);      //for reverse the odd and even value
int even1 =reverse(even);
System.out.println("Odd No ="+odd1);
System.out.println("Even No ="+even1);
System.out.println("sum of the given odd and even no is ="+(odd1+even1));
}
public int Countofdigits(int n)     
{
int count =0,digits;
while(n>0)
{
digits =n%10;
count++;
n=n/10;
}
return count;
}
public int reverse(int no)      
{
int no1=0,digit;
while(no>0)
{
digit=no%10;
no1 =no1*10 +digit;
no=no/10;
}
return no1;
}

}

