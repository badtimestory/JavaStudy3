package com.iu.st1.student;

public class Student {
	String name;
	int number;
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	public void makeTotal() {
		this.total = 0;
//		System.out.println("참조변수 this");
//		System.out.println("참조변수 this : " + this);
		this.total = kor + eng + math;
		// 평균계산
		this.avg = (kor + eng + math) / 3.0;
	}
	
	public void hello() {
		System.out.println("안녕하세요");
	}
}
