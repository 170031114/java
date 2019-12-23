import java.io.*;
import java.util.Scanner;
class maxmin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size:");
int n=sc.nextInt();
int[] arr=new int[n];
int i;
int max,min;
max=a[0];
min=a[0];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if(arr[i]<max)
{
max=arr[i];
}
else if(arr[i]<min}
{
min=arr[i];
}
}
System.out.println("max is:"+max);
System.out.println("min is"+min);
}
}