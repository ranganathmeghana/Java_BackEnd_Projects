

//class SuperShape
//{
//public int add (int a, int b)
//{
//return (a+b);
//}
//}
//class subShape extends SuperShape
//{
//public long add (int a, int b)
//{
//return ( (long) (a+b) );
//}
//}





//class MyOwn
//{
//String msg;
//int abc;
//char def;
//public MyOwn()
//{
//}
//public MyOwn (String args)
//{
//msg = args;
//
//}
//}
//public class InnerClassDemo
//{
//public static void main (String args[])
//{
//MyOwn mo = new MyOwn();
//System.out.println (mo.msg+" "+mo.abc+" "+mo.def);
//}
//}

//public class InnerClassDemo
//{
//	void
//	f2 (int a)
//	{
//		a+=20;
//	}
//	void f1 (int a)
//	{
//		a+=30;
//		f2(a);
//	}
//	public static void main (String args[])
//	{
//		int a = 20;
//		f1(a);
//	}
//}




public class InnerClassDemo implements Runnable {
	public void run() 
	{ 
		System.out.println("run.");
	throw new RuntimeException("Problem");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new InnerClassDemo());
		t.start();
		System.out.println("End of method.");
		System.out.println("hi");
		}
	}

//class A{
//	String i;
//public A(String i){this.i=i;}
//public A(){
//	this();
//}
//}
//class B extends A{
//	public B(){
//		 
//	//








//MEMBER INNER CLASS
//public class InnerClassDemo 
//{
//	public static void main(String args[])
//	{
//		outer obj=new outer();
//		obj.test();
//		outer.Inner obj1=new outer().new Inner();
//		obj1.display();
//		outer.Inner obj2= obj.new Inner();
//		obj2.display();
//		//obj.display();//Error !! Cannot access
//	}
//}
//class outer{
//	int outer_x = 100;
//	void test() {
//		Inner inner = new Inner();
//		inner.display();
//	}
//	// this is an inner class
//	class Inner {
//		void display() {
//			System.out.println("display: outer_x =" + outer_x);//can access outer class  variables and methods
//		}
//	}
//} 

//ANONYMOUS INNER CLASS
//Implementing abstract classes and interfaces using inner class 
//abstract class Person{
//	  abstract void eat();
//}
//
//class InnerClass
//{
//	public static void main(String args[])
//	{
//		Person p=new Person()
//		{
//			public void eat(){System.out.println("nice fruits");
//			}
//		};
//
//		p.eat();
//	}
//}

//LOCAL INNER CLASS
//public class InnerClass
//{  
//	private int data=30;//instance variable  
//	void display()
//	{  
//	class Local
//	{  
//	void msg() 
//	{
//	System.out.println(data);
//	}  
//	}  
//	Local l=new Local();  
//	l.msg();  
//	}  
//	public static void main(String args[])
//	{  
//	InnerClass obj=new InnerClass();  
//	obj.display();  
//	}  
//} 
