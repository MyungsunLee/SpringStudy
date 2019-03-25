package com.tg.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
//		HelloDao dao = new HelloDao();
//		
//		int result = dao.addTwoNumber(3, 5);
//		
//		System.out.println(result);

	
	AbstractApplicationContext ctx = 
			new ClassPathXmlApplicationContext("/spring-context.xml");
		//객체관리 bean 관리할수 있음
	
	
	HelloDao dao = ctx.getBean("helloDao", HelloDao.class);
	//여기서 ioc 쓴것임!
	
	
	int result = dao.addTwoNumber(5, 57);
	
	
	
	System.out.println(result);

}

}
