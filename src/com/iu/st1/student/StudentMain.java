package com.iu.st1.student;

import java.util.Scanner;

/*
 * 
 * StudentUtil() 메서드를 이용해 출력하기
 * @since 22.01.04
 * 
 * 
 * */
public class StudentMain {
	public static void main(String[] args) {
		
		StudentView sv = new StudentView();
		StudentUtil su = new StudentUtil();
		
		Student[] students = new Student[2];
		Student student = new Student();

		student.name = "춘식이";
		student.number = 1;
		student.kor = 80;
		student.eng = 70;
		student.math = 60;
		students[0] = student;
		
		student = new Student();	// 학생 1명 생성
		student.name = "파댕이";
		student.number = 2;
		student.kor = 60;
		student.eng = 70;
		student.math = 80;
		students[1] = student;
		
		Student student2 = su.search(students);
		if(student2 != null) {
			sv.viewStudent(student2);
		} else {
			sv.viewMessage("학생이 없습니다.");
		}
		System.out.println("종료");
		
		
//		sv.viewStudents(students);
		
//		// makStudnet 호출
//		// 이름, 번호, 국어, 영어, 수학 출력
//		StudentUtil stdutil = new StudentUtil();
////		Student std = stdutil.makeStudnt();
////		
//		
////		System.out.printf("이름: %s%n번호: %d%n국어: %d%n영어: %d%n수학: %d%n", 
////				std.name, std.number, std.kor, std.eng, std.math);
//		Student[] stds = stdutil.makeStudnts();
//		
//		for (int i = 0; i < stds.length; i++) {
//			Student std = stds[i];
//			System.out.println("이름: " + std.name);
//			System.out.println("번호: " + std.number);
//			System.out.println("국어: " + std.kor);
//			System.out.println("영어: " + std.eng);
//			System.out.println("수학: " + std.math);
//		}
//		
		
	}
}
