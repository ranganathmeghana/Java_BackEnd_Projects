
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainInheritance {

	
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("NewFile.xml");
		

		
		Parent obj=(Parent)context.getBean("Parentxml");
		System.out.println(obj.getMessage1());
		//System.out.println(obj.getMessage2());
		System.out.println(obj.getMessage3());
		
		Child c=(Child)context.getBean("childxml");
		System.out.println(c.getMessage1());
		System.out.println(obj.getMessage1());

		System.out.println(c.getMessage2());
		System.out.println(c.getMessage3());
		

	}

}
