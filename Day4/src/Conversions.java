import java.util.*;


public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Integer> li=new ArrayList<Integer>();
	li.add(1);
	li.add(2);
	li.add(3);
	
	Map<String,Integer> m=new HashMap<String,Integer>(li.size());
	for(Integer i:li)
	{
	 	m.put(i.toString(), i);
	
	}
	System.out.println(m.values());
	
	Set<String> s=new HashSet<String>(li.size()); 
	for(Integer j:li)
	{
		s.add(String.valueOf(j));
		
	}
	
	
	System.out.println(s);

	Set<Integer> s1=new HashSet<Integer>(li); 
	System.out.println(s1);
	
	Map<String,String> m2=new HashMap<String,String>();
	Set<Double> s2=new TreeSet<Double>();
	
	s2.add(10.09);
	s2.add(298.8);
	s2.add(56.8);
	for(Double d:s2)
	{
		m2.put(String.valueOf(d), String.valueOf(d));
	}
	try{
	String d="10.09";
	Integer i=Integer.parseInt(d);   //DOUBT
	System.out.println(i);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	Set<Double> s5=new LinkedHashSet<Double>(m2.size());
	for(String n:m2.values())
	{
		s5.add(Double.parseDouble(n));
		
	}
	System.out.println(s5);
	
	}
}