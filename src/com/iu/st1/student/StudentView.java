package com.iu.st1.student;
/*
 * 
 * viewStudent : 한명의 학생에 대한 모든 정보를 출력
 * viewStudents : 여러명의 학생의 정보를 출력
 * @since 22.01.05
 * 
 * 
 * */
public class StudentView {
	
	// 출력 전용
	public void view(Student[] students) {
		for (int i = 0; i < students.length; i++) {
//			Student student = students[i];
//			this.viewStudent(student);
			this.view(students[i]);
			
		}
	}
	
	// 출력 전용
	public void view(Student student) {	// 인스턴스의 주소를 전달받음
		System.out.println("이름: " + student.name);
		System.out.println("학생번호: " + student.number + "번");
		System.out.println("국어점수: " + student.kor + "점");
		System.out.println("영어점수: " + student.eng + "점");
		System.out.println("수학점수: " + student.math + "점");
		System.out.println("총점: " + student.total + "점");
		System.out.println("평균: " + student.avg + "점");
	}
	
	public void view(String message) {
		// 문자열 출력 테스트
		System.out.println("---------------------");
		System.out.println(message);
		System.out.println("---------------------");
		
	}

}
