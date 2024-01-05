import java.util.Scanner;
class Main3
{
public static void main(String args[])
{
//int[] num={2,-9,0,5,12,-25,22,9,8,12};
System.out.println("enter the size of an array:");
Scanner s1=new Scanner(System.in);
int b=s1.nextInt();
int[] n=new int[b];
int sum=0;
Double average;
//for(int a:n)
System.out.println("enter the elements:");
for(int i=0;i<b;i++)
{
n[i]=s1.nextInt();
sum=sum+n[i];
}
int arrayLength=n.length;
average=((double)sum/(double)arrayLength);
System.out.println("Sum="+sum);
System.out.println("Average="+average);
}
}
