import java.util.Scanner;
class Search_Element
{
public static void main(String args[])
{
int n,x,flag=0,i=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter no.of elements you want in array:");
n=s1.nextInt();
int a[]=new int[n];
System.out.println("Enter all the Elements");
for(i=0;i<n;i++)
{
a[i]=s1.nextInt();
}
System.out.println("Enter the elements you want to find:");
x=s1.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("Element found at position:"+(i+1));
}
else
{
System.out.println("Element not found");
}
}
}

