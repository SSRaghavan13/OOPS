package com.oops.test;

public class VariableScope {
	static int x = 11;
	static int y = 33;
	public void method(int x) {
		VariableScope t = new VariableScope(); 
        this.x = 22; 
        y = 44; 
  
        System.out.println("Test.x: " + VariableScope.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
	}
	public static void main(String[] args) {
		VariableScope t = new VariableScope(); 
        t.method(5); 
	}

}
