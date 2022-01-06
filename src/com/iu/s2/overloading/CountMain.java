package com.iu.s2.overloading;
/*
 * 
 * 
 * @since 22.01.06
 * 
 * 
 * */
public class CountMain {
	public static void main(String[] args) {
		Count count = new Count();
		count.sum(1, 2, 3);
		count.sum(10, 1.2);
		
		System.out.println();
	}
}
