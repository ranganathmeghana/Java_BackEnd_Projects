
public class SpringsConst
{
private int id;
String name;

	public SpringsConst()
	{
		System.out.println("HI I'M CONST");
	}
	
	public SpringsConst(int id)
	{
		this.id=id;
		System.out.println("Hi i'm id"+id);
	}
	
	public SpringsConst(String name)
	{
		this.name=name;
		System.out.println("Hi I'm name"+name);
	}
	
	public SpringsConst(int i,String s)
	{
		this.id=i;
		this.name=s;
		System.out.println("Hi i'm id"+id+""+"hi i'm name"+name);
	}
	
}

class ChildSpringConst 
{
	int empid;
	String empName;
	
	public ChildSpringConst()
	{
		super();
		System.out.println("Hi i'm child const");
	}
	
	public ChildSpringConst(int i)
	{
		this.empid=i;
		System.out.println("Hi i'm child int const"+empid);
	}
	
	public ChildSpringConst(String s)
	{
		this.empName=s;
		System.out.println("Hi i'm child String const"+empName);
	}
	
}

