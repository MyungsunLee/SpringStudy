package com.tg.edu;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tg.hello.HelloDao;

public class StudyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		ScoreDto scoreDto = new ScoreDto(100,90);
//		
//		Student student = new Student();
//		
//		student.name = "홍길동";
//		
//		student.showStudent();
//		DI를 쓰지 않는 방식
		
		ScoreDto scoreDto = new ScoreDto(100,90); 
		Student s = new Student(scoreDto);
		s.name = "홍길동";
		s.showStudent();
		
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/spring-context.xml");
			//객체관리 bean 관리할수 있음
		
		
		ScoreDto scoreDto2 = ctx.getBean("scoreDto", ScoreDto.class);
		
		Student s2 = new Student(scoreDto2);
		s2.name = "홍길동2";
		s2.showStudent();
		//컨테이너(Beans)를 통해 불러옴
		
	}

}
