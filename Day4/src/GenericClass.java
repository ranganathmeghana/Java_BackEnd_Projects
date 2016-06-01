import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;




public class GenericClass {

	public static <T> void printArray(T[] arr)
	{
		for(T elem: arr)
		{
			System.out.println(elem);
			
		}
		
	}
	public static void printCollection(Collection c) {
	    Iterator i = c.iterator();
	    for (int k = 0; k < c.size(); k++) {
	        System.out.println(i.next());
	    }
	}
	
	public static void printCollection2(Collection<Object> c)
	{
	    for (Object e : c) {
	        System.out.println(e);
	    }
	}


	
	public static void main(String[] args) 
	{
		String arr1[]={"Hi","Hello","Bye"};
		Integer arr2[]={1,4,6,8};
		
//		List l=new ArrayList(); 
//		l.add("Hi");
//		l.add(1);
//		for(Object e:l)
//		{
//			if(e.getClass().getName().equalsIgnoreCase("java.lang.String"))
//			{
//				System.out.println(e);
//			}
			
//		printArray(arr1);
//		printArray(arr2);
		List l2=new ArrayList<Animal>();
		B b=new B();
		
		l2.add(b);
		GenericClass g=new GenericClass();
		l2.add(g);
		
//		Collection<?> li=new ArrayList<String>();
//		li.add(new Object());
//		li.add();
		List<?> li2=new ArrayList<Integer>();
		List l3=new ArrayList<Integer>();
		l3.add(1);
		l3.add(3);
		printCollection(l3);
		printCollection2(l3);
		
		List<?> l4=new ArrayList<Integer>();
		 
		Collection<? extends Integer> test = new ArrayList<Integer>();
	//	test.add(10);
		
	}

	}
class Animal
{
	
}
class B extends Animal
{
	
}