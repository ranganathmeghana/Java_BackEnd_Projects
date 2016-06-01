package com.infy.allclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.infy.newClass.B;



//@Component

//@Configuration
@Service
public class A {
	
	private A a;

//	@Autowired
	private B b;
	
	//@Autowired
	private C c;
	
	
	public A() {
	    System.out.println("THIS IS A"+this);
    }
	
	public void setB(B b)
	{
		this.b=b;
		System.out.println("set b"+b);
	}

	
	public void setC(C c){
		this.c=c;
		System.out.println("set b"+c);
	}
	
	
	public void disp(){
		c.dispc();

		System.out.println("hiiiiiiiiiiiiii"+c);
	}
	
	
//	@Autowired
//	@Bean
	public void call(B b){
		b.hello();
	}
}
