package com.iu.st1.method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		System.out.println("MainMethod Start");
		System.out.println("Conflict Test");
		
		// 객체 생성 코드
		// new 클래스명();
		ReturnStudy rs = new ReturnStudy();
		
		// 참조변수명.변수들
		rs.test1();
		
		int num = rs.test2();
		System.out.println("Main: " + num);
		
		String name = rs.test3();
		System.out.println("test3: " + name);
		
		double randomValue = Math.random();
		System.out.println("랜덤 값: " + randomValue);
		
		Scanner sc = rs.test4();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		System.out.println(+age);
		System.out.println("Math.random" + num);
		
		System.out.println("MainMethod Finish");
	}
}
