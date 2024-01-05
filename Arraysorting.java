import java.util.Scanner;
class Arraysorting
{
public static void main(String args[])
{
int n,i=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter no.of elements you want in array:");
n=s1.nextInt();
int a[]=new int[n];
System.out.println("Enter all the Elements");
for(i=0;i<n;i++)
{
a[i]=s1.nextInt();
}
//code for sorting array
for(i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int x:a)
{
System.out.print(x+" ");
}
}
}
