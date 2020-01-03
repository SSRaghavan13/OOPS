package com.oops.exception;

public class MultipleExceptions {

	public static void main(String[] args) {
		int a = 10, b = 0, c = 0;
		try {
			c = a / b;
			throw new NullPointerException();
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}
}
