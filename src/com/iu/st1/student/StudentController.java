package com.iu.st1.student;
/*
 * 
 * 패키지 내 메서드를 제어하는 StudentController
 * @ since 22.01.15
 * 
 * 
 * */
import java.util.Scanner;

public class StudentController {
	public void Start() {
		Scanner scanner = new Scanner(System.in);
		boolean cheak = true;
		StudentUtil sutil = new StudentUtil();
		// sutil.initUtil();
		StudentView sv = new StudentView();
		Student[] students = null;

		while (cheak) {
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생정보 검색 출력");
			System.out.println("4. 프로그램 종료");

			System.out.println("번호를 입력하세요: ");
			int InputNumber = scanner.nextInt();
			
			// switch case로 작성하기
			switch (InputNumber) {
			case 1:
				students = sutil.makeStudnts();
				break;
			case 2:
				if(students != null) {
					sv.view(students);					
				} else {
					sv.view("학생정보를 먼저 입력하세요");
				}
				break;
			case 3:
				if(students == null) {
					sv.view("학생 정보가 없습니다.");
					continue;
				}
				Student student = sutil.search(students);
				if(student != null) {
					sv.view(student);
				} else {
					sv.view("검색 결과가 없습니다. ");
				}
				break;
			default:
				cheak = false;
				break;
			}
		} // end of while
	}
}
