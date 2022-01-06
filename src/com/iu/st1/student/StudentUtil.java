package com.iu.st1.student;

import java.util.Scanner;

/*
 * 
 * 키보드로부터 이름, 번호, 국어, 영어, 수학 입력 리턴
 * @since 22.01.04
 * 
 * 
 * */
public class StudentUtil {
	Scanner sc;
	
	// 학생 객체를 생성하고 정보를 입력 받는 곳
	public void initUtil() {
		this.sc = new Scanner(System.in);
	}
	
	public Student search(Student[] students) {
		// 검색할 학생의 번호를 입력
		// 입력 받은 번호와 일치하는 학생을 찾아서 리턴
		
		System.out.print("검색할 학생의 번호를 입력하세요: ");
		int num = sc.nextInt();

		Student student = null;
		
		for (int i = 0; i < students.length; i++) {
			if(students[i].number == num ) {
				System.out.println("검색할 학생 번호 입력");
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	public Student[] makeStudnts() {
		// 학생의 수를 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 수를 입력하세요: ");
		int count = sc.nextInt();
		Student[] students = new Student[count];
		
		for (int i = 0; i < students.length; i++) {
			// 키보드로부터 이름, 번호, 국어, 영어, 수학 입력
			Student student = new Student();
			System.out.print("이름을 입력하세요: ");
			student.name = sc.next();
			System.out.print("번호를 입력하세요: ");
			student.number = sc.nextInt();
			System.out.print("국어 점수를 입력하세요: ");
			student.kor = sc.nextInt();
			System.out.print("영어 점수를 입력하세요: ");
			student.eng = sc.nextInt();
			System.out.print("수학 점수를 입력하세요: ");
			student.math = sc.nextInt();
			student.makeTotal();
			students[i] = student; 
		}
		// 학생들의 정보를 리턴
		// 배열
		return students;
	}
	
	public Student makeStudnt() {
		Student student = new Student();
		
		System.out.print("이름을 입력하세요: ");
		student.name = sc.next();
		System.out.print("번호를 입력하세요: ");
		student.number = sc.nextInt();
		System.out.print("국어 점수를 입력하세요: ");
		student.kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		student.eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		student.math = sc.nextInt();
		student.makeTotal();
		return student;
	}
}

