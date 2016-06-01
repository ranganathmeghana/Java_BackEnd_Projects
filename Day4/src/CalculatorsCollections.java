import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CalculatorsCollections 
{
	public Double compute(Double a,char c,Double b)
	{
switch(c)
{

case '+': return a+b;

case '-': 
	//System.out.println("enters sub");
	return a-b;

case '*': return a*b;

case '/': return a/b;

default: 
//System.out.println("invalid input");
return 0.0d;
	}
}
	
	
	public static void main(String args[])
	{
	
		List<String> li=new ArrayList<String>();
		CalculatorsCollections obj=new CalculatorsCollections();
		Scanner one= new Scanner(System.in);
		System.out.println("Enter the input:");
		String str= one.next();
		char c;
		Double res=0.0d;
		String s;
		String x="";
		String y="";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/')
			{
				li.add(x);
				x="";
				y=y+str.charAt(i);
				li.add(y);
				y="";
				
			}
			else if(i==str.length()-1)
			{
				x=x+str.charAt(i);
				li.add(x);
				
			}
			else
			{
				
				x=x+str.charAt(i);
			}
		}
		
		for(String k:li)
		{
			System.out.println(k);
		}

		res=Double.parseDouble(li.get(0));
		for(int j=1;j<li.size()-1;j+=2)
		{
			System.out.println("entered");
			System.out.println(res);
			System.out.println(li.get(j).charAt(0));
			System.out.println(Double.parseDouble(li.get(j+1)));
			res=obj.compute(res,li.get(j).charAt(0),Double.parseDouble(li.get(j+1)));
			
		}
		
		System.out.println("result is:"+res);
		
		
		List<String> link=new LinkedList<String>();
		link.add("Hi");
		System.out.println(link.get(0));
		
		
		List<Integer> ili=new ArrayList<Integer>(li.size());
		for(String st:li)
		{
			ili.add(Integer.parseInt(st));
			
		}
		for(Integer in:ili)
			System.out.println(in);
		
		
	}
	
	
	//for(Object j:li)
		//{
			//System.out.println(j);
		//}
		
		

}
