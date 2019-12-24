import java.io.*;
import java.util.Scanner;
class main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i;
int a[]=new int[n];
char ch=0;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=65;i<=97;i++)
{
ch=(char)i;
}
System.out.println(ch);
}
}
