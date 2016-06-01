

public class MethodOverriding {
	public static void main(String args[])
	{
		//Super class object
		superClass obj=new superClass();
		obj.fn_Override(9);
		//sub class object
		subClass obj1=new subClass();
		obj1.fn_Override(2);
		//Superclass reference
		superClass obj2=new subClass();
		obj2.fn_Override(7);
		//Illegeal usage : subclass reference
		 //subClass obj3=new superClass();
		 //obj3.fn_Override(8);
	}
}
class superClass
{
	//Constructors
	superClass()
	{
		System.out.println("SuperClass:Inside default constructor");
	}
	superClass(int i_var)
	{
		System.out.println("SuperClass:Inside parameterized constructor"+i_var);
	}
	//Method
	void fn_Override(int i_var1)
	{
		System.out.println("SuperClass:Inside function:"+i_var1);
	}
}
class subClass extends superClass
{
	subClass()
	{
		super(8);
		System.out.println("SubClass:Inside default constructor"); 
	}
	@Override
	void fn_Override(int i_var2)
	{
		System.out.println("SubClass:Inside function:"+i_var2);
	}
} 