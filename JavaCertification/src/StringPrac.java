
public class StringPrac {

	
	
	public static void main(String[] args) {
	    
		String s=new String("Test");
		
		String s1="Test";
		
		if(s.equals(s1))
		{
			System.out.println("they are equal value");
		}
		if(s==s1)
		{
			System.out.println("equal references");
		}
		
		else
			
		{
			System.out.println("nothing");
	}
		
	 s=s1;
		
		if(s.equals(s1))
		{
			System.out.println("they are equal value");
		}
	   if(s==s1)
		{
			System.out.println("equal references");
		}
		
		else
			
		{
			System.out.println("nothing");
	}
		
		String s3="Test";
		
		if(s1.equals(s3))
		{
			System.out.println("they are equal value");
		}
	   if(s1==s3)
		{
			System.out.println("equal references");
		}
		
		else
			
		{
			System.out.println("nothing");
	}
	   
	   s1="Test1";
	   
	   if(s1.equals(s3))
		{
			System.out.println("they are equal value");
		}
	   if(s1==s3)
		{
			System.out.println("equal references");
		}
		
		else
			
		{
			System.out.println("nothing");
	}
	   
	   
	   
	   String p1 = "Rakesh";
	   String p2 = "Rakesh";
	   String p3 = "Rakesh".intern();
	   String p4 = new String("Rakesh");
	   String p5 = new String("Rakesh").intern();

	   if ( p1 == p2 ){
	       System.out.println("s1 and s2 are same");  // 1.
	   }

	   if ( p1 == p3 ){
	       System.out.println("s1 and s3 are same" );  // 2.
	   }

	   if ( p1 == p4 ){
	       System.out.println("s1 and s4 are same" );  // 3.
	   }

	   if ( p1 == p5 ){
	       System.out.println("s1 and s5 are same" );  // 4.
	   }
	   
	   
	   if ( p4 == p5 ){
	       System.out.println("s4 and s5 are same" );  // 4.
	   }
	   
		
    }
	
	
	
	}
