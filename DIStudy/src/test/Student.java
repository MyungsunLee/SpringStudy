package test;

public class Student {
	
//	String name;
//	ScoreDto scoreDto; //의존관계, 학생은 성적을 가질 수 있다
//	
//	public Student() {
//		scoreDto = new ScoreDto(100,90);
//		
//		
//	}
//	
//	public void showStudent() {
//		System.out.println("이름은 " + name);
//		String str = scoreDto.toString();
//		
//		System.out.println(str);
//	}
	public Student(ScoreDto scoreDto) {
		this.scoreDto = scoreDto;
	}
	
	String name;
	ScoreDto scoreDto;
	
	public void setScore(ScoreDto scoreDto) {
		this.scoreDto = scoreDto;
	}
	//new를 안쓰고 매개변수의 형태로 쓰면 이런 형식으로..
	
	
	public void showStudent() {
		System.out.println("이름은 " + name);
		String str = scoreDto.toString();
		
		System.out.println(str);
	}
		
	
	
	
	
	
	
	
	
	
	
	

}
