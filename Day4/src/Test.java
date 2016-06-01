import java.lang.reflect.*;

public class Test{  
    public static void main(String args[]){  
     try{  
    Class c=Class.forName("Fox");  
    //Class c2=new Class();
    //Fox v=(Fox)c;
    System.out.println(c);
//    Fox s=(Fox)c.newInstance();  
//   s.message();  
     Fox s=new monkey();
     monkey m=(monkey)s;
     //javap Test;
     
     }
     catch(Exception e){System.out.println(e);}  
     
    }  
   
   }  

class Fox{  
//	static 
//	{
//		System.out.println("static inside Simple class");
//	}
    public void message(){System.out.println("Hello Java");}  
   }  
    class monkey extends Fox{
    	public void display()
    	{
    		System.out.println("im in monkey");
    	}
    }
   