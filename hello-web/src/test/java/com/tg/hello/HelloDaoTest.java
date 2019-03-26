package com.tg.hello;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloDaoTest {

	@Test
	public void testAddTwoNumber() {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/spring-context.xml");
		
		HelloDao helloDao = ctx.getBean("helloDao", HelloDao.class);
		
		int result = helloDao.addTwoNumber(10, 30);
		
		System.out.println(result);
		
		Assert.assertEquals(40, result);
		
	}
	
}
