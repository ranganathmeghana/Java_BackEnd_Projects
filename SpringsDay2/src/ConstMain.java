
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstMain {

	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("NewFileConst.xml");
		SpringsConst obj=(SpringsConst)context.getBean("const");
	
		ChildSpringConst obj1=(ChildSpringConst)context.getBean("child");
		
	}

}
