package com.tg.edu;

public class ScoreDto {

	
	private int kor = 0;
	private int eng = 0;
	private String subject = "";
	
	
	
	
	
	public String getSubject() {
		return subject;
	}

	public ScoreDto(int kor, int eng, String subject) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.subject = subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public ScoreDto() {
		super();
	}
	
	public ScoreDto(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "ScoreDto [kor=" + kor + ", eng=" + eng + ", subject=" + subject + "]";
	}
	
	

	
	
}
