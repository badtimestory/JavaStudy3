package com.iu.st2.constructor;
/*
 * 
 * 생성자와 오버로딩 
 * @since 22.01.06
 * 
 * 
 * */
public class Car {
	String brand;		// 브랜드
	String company;		// 제조회사
	String color;		// 차량색
	int cc;				// cc
	
	// 생성자 특수한 메서드
	public Car() {
		this("K9");
//		this.company = "kia";
//		this.brand = "K9";
//		this.color = "black";
//		this.cc = 5000;
	}

	public Car(String brand) {
		this(brand, "black");
//		this.company = "kia";
//		this.brand = brand;
//		this.color = "black";
//		this.cc = 5000;
	}
	
	public Car(String brand, String color) {
		this(brand, color, 5000);
//		this.company = "kia";
//		this.brand = brand;
//		this.color = color;
//		this.cc = 5000;
	}
	
	public Car(String brand, String color, int cc) {
		this.company = "kia";
		this.brand = brand;
		this.color = color;
		this.cc = cc;
	}
	
	// 맴버메서드
	public void info() {
		System.out.println("멤버메서드");
		System.out.println(this.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cc);
	}
}
