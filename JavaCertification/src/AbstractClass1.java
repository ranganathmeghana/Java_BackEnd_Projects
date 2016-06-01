
public class AbstractClass1 {
	public static void main(String args[])
	{
		circle obj=new circle();
		obj.area();
		obj.fn_test();
		obj.fn_TestCircle();
		rect obj1=new rect();
		obj1.area();
		obj1.fn_test();
		shape obj2=new circle();
		obj2.area();
		obj.fn_test();
		obj.fn_TestCircle();
	}
}
abstract class shape
{
	abstract void area();
	void fn_test()
	{
		System.out.println("Inside Abstract Class");
	}
}
class circle extends shape
{
	@Override
	void area()
	{
		int rad=2;

		System.out.println("Area is :"+(3.14*(rad*rad)));
	}
	//own method
	void fn_TestCircle()
	{
		System.out.println("Inside circle class");
	}
}
class rect extends shape
{
	void area()
	{
		int l=10,b=20;
		System.out.println("Area of rect :"+(l*b));
	}
} 