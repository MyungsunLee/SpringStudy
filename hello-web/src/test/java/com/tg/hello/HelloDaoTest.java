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
		
//		System.out.println(result);
		
		//static class
//		Assert.assertEquals(40, result);
		
		Assert.assertEquals(
				50, helloDao.addTwoNumber(10, 40)); //와우...
		//result 안쓰고 이런 방식으로 할것임!! 싱기방기
		
	}
	
	
	
	@Test
	public void testSubTwoNumber() {
		
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/spring-context.xml");
		
		HelloDao helloDao = ctx.getBean("helloDao", HelloDao.class);
		
		helloDao.subTwoNumber(10, 1);
		
		Assert.assertEquals(
				9, helloDao.subTwoNumber(10, 1));
		//일부러 틀린것. 에러가 아닌 실패
	}
	
}



