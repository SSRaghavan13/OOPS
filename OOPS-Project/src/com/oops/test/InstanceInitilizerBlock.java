package com.oops.test;

public class InstanceInitilizerBlock {
	
	{
		System.out.println("In IIB-1");
	}
	
	{
		System.out.println("In IIB-2");
	}
	
	//Static block is called even without initializing a class, when the class is loaded in JVM
	static {
		System.out.println("In static block");
	}

	public static void main(String[] args) {
		InstanceInitilizerBlock obj = new InstanceInitilizerBlock();
		System.out.println("In main");
	}

}
