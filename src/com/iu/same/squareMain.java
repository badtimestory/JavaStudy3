package com.iu.same;
/*
 * 
 * 가로, 세로의 길이가 같은지 비교하는 클래스
 * @since 22.01.05
 * 
 * 
 * */
public class squareMain {

	public static void main(String[] args) {
		Square s1 = new Square();
		s1.width = 5;
		s1.length = 5;
		boolean result = s1.same(s1);
		System.out.println("s1의 매개변수와 맴버변수 값 비교: " + result);
		
		Square s2 = new Square();
		s2.width = 3;
		s2.length = 4;
		boolean result2 = s2.same(s2);
		System.out.println("s2의 매개변수와 맴버변수 비교: " + result2);
		
		boolean check = (s1 == s2);
		System.out.println("s1 == s2의 객체주소 비교 " + check);
		
	}

}
