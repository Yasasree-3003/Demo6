//calling parameterised constructor from default constructor
class A1
{
A1()
{
this(5);
System.out.println("hello a");
}
A1(int x)
{
System.out.println(x);
}
}
class TestThis5
{
public static void main(String rgs[])
{
A1 a=new A1();
}
}