import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) 
	{
//		ApplicationContext context=new ClassPathXmlApplicationContext("Springs.xml");
//		
//		SpringHelloWorld obj= (SpringHelloWorld)context.getBean("meghana");
//		System.out.println(obj.getMessage());
//		
//		
//		obj.setMessage("Hi meghana");
//        System.out.println(obj.getMessage());
//        
//        SpringHelloWorld ob2= (SpringHelloWorld)context.getBean("meghana");
//        obj.setMessage("hi obj 2");
//        System.out.println(ob2.getMessage());
//        
//        
		
		
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	      TextEditor te = (TextEditor) context.getBean("textEditor");

	      te.spellCheck();
	}

}
