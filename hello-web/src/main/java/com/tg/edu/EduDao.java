package com.tg.edu;

public class EduDao {

	
	ScoreDto scoreDto = new ScoreDto();
	
	
	public Student getStudent() {
		
		
//		
			Student student = new Student();
			student.setName("이명선");
			
			return null;
		
	}
	
//	public ScoreDto setScore () {
//		
//		
//		return null;
//	}
	
	public int getScoreDto(int eng, int kor) {
		
		ScoreDto scoreDto = new ScoreDto(eng, kor);
		
//		scoreDto.setEng(70);
//		scoreDto.setKor(60);
		
		int result = scoreDto.getEng() + scoreDto.getKor();
		
		return result;
	}
	
	
	

}
