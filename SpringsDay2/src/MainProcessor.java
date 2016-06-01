import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainProcessor {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFileProcessor.xml");
		HelloworldProcessor obj=(HelloworldProcessor)context.getBean("processor");
		PostAndPre obj1=(PostAndPre)context.getBean("PostAndPre");
		obj.getMessage();
		obj.init();
		obj.destroy();

	}

}
