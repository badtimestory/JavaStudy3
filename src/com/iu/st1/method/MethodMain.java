package com.iu.st1.method;
public class MethodMain {
	public static void main(String[] args) {
		System.out.println("MainMethod Start");
		
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
		
		System.out.println("MainMethod Finish");
	}
}
