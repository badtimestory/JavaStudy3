package com.iu.st2.constructor;

public class CarMain {
	public static void main(String[] args) {
		// 변수 선언 = new 생성자호출
		Car car = new Car();
//		car.brand = "k7";
//		car.company = "kia";
//		car.cc = 2000;
		car.info();
//		car.Car();	// 에러 발생
		Car car2 = new Car("k5");
		car2.info();
		Car car3 = new Car("K9", "White");
		car3.info();
		Car car4 = new Car("K5", "Yellow", 2000);
		car4.info();
	}
}
