package com.iu.st1.method;

import java.util.Random;
import java.util.Scanner;

/*
 * 
 * 어제 했던 메서드호출 복습 + 결과값 반환
 * @since 22.01.04
 * 
 * 
 * */
public class ReturnStudy {

	// 접근지정자 [그외지정자] 리턴타입, 메서드명([매개변수 선언]){}
	public void test1() {
		System.out.println("void는 리턴이 없을 때 사용");
	}
	
	public int test2() {
		Random random = new Random();
		int num = random.nextInt(10);
		System.out.println("test2: " + num);
		return num;
	}
	
	public String test3() {
		// 키보드로부터 이름을 입력받고 리턴
		System.out.println("이름을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		return name;
	}
}
