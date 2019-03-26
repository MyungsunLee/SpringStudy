package test;

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
		
		
		ScoreDto scoreDto2 = new ScoreDto(10,20); 
		Student s2 = new Student(scoreDto2);
		s2.name = "홍길동";
		s2.showStudent();
		
		
	}

}
