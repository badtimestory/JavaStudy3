package com.iu.st1.student;

import java.util.Scanner;

public class StudentController {
	public void Start() {
		Scanner scanner = new Scanner(System.in);
		boolean cheak = true;
		StudentUtil sutil = new StudentUtil();
		StudentView sv = new StudentView();
		Student[] students = null;

		while (cheak) {
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 프로그램 종료");

			System.out.println("번호를 입력하세요: ");
			int InputNumber = scanner.nextInt();
			

			// switch case
			switch (InputNumber) {
			case 1:
				students = sutil.makeStudnts();
				break;
			case 2:
				sv.viewStudents(students);
				break;
			default:
				cheak = false;
				break;
			}
		} // end of while
	}
}
