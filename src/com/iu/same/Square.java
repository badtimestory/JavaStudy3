package com.iu.same;
/*
 * 
 * 사각형의 클래스를 정의해놓음
 * 맴버변수 width랑 매개변수로 받은 객체의 width같고
 * 맴버변수 length랑 매개변수로 받은 객체의 length가 같으면 true 리턴
 * 아니면 false 반환
 * @since 22.01.05
 * 
 * 
 * */
public class Square {

	int width;		// 가로
	int length;		// 세로
	
	public boolean same(Square s) {
		
		if(width == this.width && length == this.length) {
			return true;
		} else {
			return false;
		}
	}
}
