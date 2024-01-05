class A2
{
int rollno;
String name,course;
float fee;
A2(int rollno,String name,String course)
{
this.rollno=rollno;
this.name=name;
this.course=course;
}
A2(int rollno,String name,String course,float fee)
{
this(rollno,name,course);
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
}
class TestThis6
{
public static void main(String args[])
{
A2 s1=new A2(111,"ankit","JAVA");
A2 s2=new A2(112,"sumit","JAVA",7000);
s1.display();
s2.display();
}
}
