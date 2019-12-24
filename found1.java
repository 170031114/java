import java.io.*;
import java.util.Scanner;
class found1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[100];
System.out.println("enter size:");
int n=sc.nextInt();
System.out.println("enter element");
int k=sc.nextInt();
int i;
int found=0;
for(i=0;i<n;i++)
  {
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
  {
if(a[i]==k)
     {
found=1;
break;
      }
  }
if(found==1)
  {
System.out.println(i+1);
  }  
else{
System.out.println("-1");
     }
}
}
