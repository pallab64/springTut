package com.spring_1;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {

	public static void main(String[] args) {
	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
	    Question a=context.getBean("q",Question.class);  
	    a.show();  

	}

}
