package practicePackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
		System.out.println(obj.getMessage());

	}

}
