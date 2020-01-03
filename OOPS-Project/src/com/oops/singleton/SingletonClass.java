package com.oops.singleton;

public class SingletonClass {

	private static SingletonClass instance = null;
	public int a;
	
	private SingletonClass() {
		this.a = 10;
	}
	
	public static SingletonClass Singleton() {
		if(instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.Singleton();
		SingletonClass obj2 = SingletonClass.Singleton();
		obj1.a = 20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
