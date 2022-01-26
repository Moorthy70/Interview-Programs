import java.io.*;
import java.util.Scanner;
public class Q5
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the no of rows");
int m = in.nextInt();
System.out.println("Enter the no of columns");
int n = in.nextInt();
System.out.println("Enter the i");
int i = in.nextInt();
int[][] matrix = new int[n][m];
for(int k =0;k<n;k++)
{
for(int j =0;j<m;j++)
{
if(k==n-1&&j==i-1)
{
matrix[k][j]=1;
}
else
{
matrix[k][j]=0;
}
}
}
for(int x=0;x<n;x++)
{
	for(int y=0;y<m;y++)
	System.out.print(matrix[x][y] +" ");
System.out.println(" ");
}
}
}