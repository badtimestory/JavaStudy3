package com.iu.s2.overloading;
/*
 * 
 * Conut 클래스
 * 오버로딩
 * @since 22.01.06
 * 
 * 
 * */
public class Count {
	public void sum(int x, int y) {
		int sum = x + y;
		System.out.println("sum: " + sum);
	}

	public void sum(int x, double y) {
		double sum = x + y;
		System.out.println("sum: " + sum);
	}
	
	public void sum(double x, int y) {
		double sum = x + y;
		System.out.println("sum: " + sum);
	}
	
	public void sum(double x, double y) {
		double sum = x + y;
		System.out.println("sum: " + sum);
	}
	
	public void sum(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println("sum: " + sum);
	}
}
