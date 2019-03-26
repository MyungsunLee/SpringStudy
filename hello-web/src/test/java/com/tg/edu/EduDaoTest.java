package com.tg.edu;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EduDaoTest {	
	//	클래스명은 동일한 클래스 Test로 한다
	
//	@Test
	//메서드 명명규칙
	//public void test 메서드명() <--매개변수 없어야 함
//	public void testSetName() {
//		
//		AbstractApplicationContext ctx = 
//				new ClassPathXmlApplicationContext("/spring-context.xml");
//		
//			Student student = ctx.getBean("student", Student.class);
//			
//			ScoreDto scoreDto = ctx.getBean("scoreDto", ScoreDto.class);
//			
//			scoreDto.setEng(60);
//			scoreDto.setKor(80);
//			scoreDto.setSubject("여긴 과목명");
//			student.setScore(scoreDto);
//			
//			
//			Assert.assertEquals(80, scoreDto.getKor());
//			
////			=============================================
////			여기까지 테스트 완료
//			
//
//			student.setName("이명선");
//			
//		Assert.assertEquals("이명선", student.getName());
//	}
//	
//	
//	@Test
//	public void testGetStudentName() {
//		
//		Student student = new Student();
//		
//		
//		
//	}
//	
	@Test
	public void testGetSudent() {
		
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/spring-context.xml");
		
			EduDao eduDao = ctx.getBean("eduDao", EduDao.class);
			
			
//			eduDao.getStudent().setName("이명선");
			
			
//			Assert.assertEquals("이명선", eduDao.getStudent().getName());
			
//			String name = eduDao.getStudent().getName();
//			
//			Assert.assertTrue(name.equals("이명선"));
			
			//오만거 다 비교할 수 있음.ㅎ
			
			Assert.assertNull(eduDao.getStudent()); //정말 자주쓰일것임! 얘는 true
//			Assert.assertNull(eduDao); //얘는 false.
			
	}
	
	@Test
	@Ignore	//ignore은 보류/완성의 의미로 JUnit으로 실행 x(보통 완성하고 많이씀)
	public void testGetScoreDto() {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/spring-context.xml");
		
		EduDao eduDao = ctx.getBean("eduDao", EduDao.class);
		
//		eduDao.getScore();
		
		
//		eduDao.scoreDto.setEng(70);
//		eduDao.scoreDto.setKor(60);
//		
//		eduDao.getScoreDto();
//		
//		
//		Assert.assertTrue((eduDao.scoreDto.getEng() + eduDao.scoreDto.getKor()) == 130);
//		
		
		
		
		int result = eduDao.getScoreDto(100, 80);
		
		Assert.assertTrue(result == 180);
		
		Assert.assertFalse(result > 200);
		
	
//		eduDao.getScoreDto().setEng(80);
//		eduDao.getScoreDto().setKor(60);
//		
//		int result = eduDao.getScoreDto().getEng() + eduDao.getScoreDto().getKor();
//		
//		Assert.assertTrue(result == 140);
		
		
//		Assert.assertTrue(eduDao.);
		
//		eduDao.getScore().setEng(70);
//		eduDao.getScore().setKor(90);
//		
//		int result = eduDao.getScore().getEng() + eduDao.getScore().getKor();
//		
//		
//		Assert.assertTrue(result == eduDao.getScore().addScore());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
