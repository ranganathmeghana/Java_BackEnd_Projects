package com.infy.allclasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationClass.class);
A a=context.getBean(A.class);
a.disp();
	  // A a=(A)context.getBean("classA");
   //	B b=(B)context.getBean("classB");
//		C c=(C)context.getBean("classC");
		
	}

}
