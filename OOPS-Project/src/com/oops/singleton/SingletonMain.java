package com.oops.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.Singleton();
		SingletonClass obj2 = SingletonClass.Singleton();
		obj1.a = 20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
