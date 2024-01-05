class A1
{
A1()
{
System.out.println("hello a from default constructor");
}
A1(int x)
{
this();
System.out.println(x);
}
}
class TestThis4
{
public static void main(String rgs[])
{
A1 a=new A1(10);
}
}