

public class AccessSpecifiers {
public static void main(String arg[])
{
Child1 ch=new Child1(); 
System.out.println("The value in child is"+ ch.number);
Parent1 p=new Parent1();
System.out.println("The value in Parent is"+ p.number);
}
}
class Parent1
{
//protected 
int number=100;
}
class Child1 extends Parent1
{
} 

