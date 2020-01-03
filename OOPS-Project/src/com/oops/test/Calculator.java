package com.oops.test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter numbers a & b");
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		int opr = Integer.parseInt(sc.nextLine());
		switch(opr) {
		case 1: System.out.println(add(a,b));
				break;
		case 2: System.out.println(sub(a,b));
				break;
		case 3: System.out.println(mul(a,b));
				break;
		case 4: System.out.println(div(a,b));
				break;
		}
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static int sub(int a, int b) {
		return a - b;
	}
	
	static int mul(int a, int b) {
		return a * b;
	}
	
	static int div(int a, int b) {
		return a / b;
	}
}
