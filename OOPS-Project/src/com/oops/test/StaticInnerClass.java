package com.oops.test;

class StaticInnerClass {
	public static String str = "Hello";
	
	public static class NestedStaticClass {
		public void printMsg() {
			System.out.println(str);
		}
	}
	
	public class InnerClass {
		public void display() {
			System.out.println(str);
		}
	}
	
	public static void main(String args[]) {
		StaticInnerClass.NestedStaticClass printer = new StaticInnerClass.NestedStaticClass();
		printer.printMsg();
		
		StaticInnerClass.InnerClass innerObj = new StaticInnerClass().new InnerClass();
		innerObj.display();
	}
}
