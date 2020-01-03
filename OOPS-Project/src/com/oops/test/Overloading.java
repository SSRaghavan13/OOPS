package com.oops.test;

public class Overloading {
	public void area (double r) {
		System.out.println(2*3.14*r);
	}
	public void area (int a) {
		System.out.println(a*a);
	}
	public void area (int a, int b) {
		System.out.println(a*b);
	}
	public static void main (String[] args) {
		Overloading obj = new Overloading();
		obj.area(5, 8);
	}
}