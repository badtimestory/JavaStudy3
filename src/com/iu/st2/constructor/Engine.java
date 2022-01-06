package com.iu.st2.constructor;
/*
 * 
 * Engine 클래스 생성
 * @since 22.01.06
 * 
 * */
public class Engine {
	// 직접 대입
	String name = "V1";	// 이름
	String fuel = "F1";	// 연료
	
	// 초기화 블럭
	{
		System.out.println("초기화 블럭");
		this.name = "V2";
		this.fuel = "F2";
	}
	// 생성자
	public Engine() {
		System.out.println("생성자 실행");
		this.name = "V3";
		this.fuel = "F3";
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.fuel);
	}
}
