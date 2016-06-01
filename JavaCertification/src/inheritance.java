
public class inheritance {
	public static void main(String arg[])
	{
	Parent p=new Parent();
	Child ch=new Child(9);
	//System.out.println("The value in parent is "+p.number);
	//System.out.println("The value in child is "+ch.number);
	}
}
class Child extends Parent{
Child()
{
//super();
System.out.println("c def");
}
Child(int j)
{
	this();
	//super(8);
	System.out.println("c par"+j);
}

}

 class Parent {
int number=100;

Parent()
{
	System.out.println("p def");
}
Parent(int i)
{
	//this();
	System.out.println("p par"+i);
}

} 