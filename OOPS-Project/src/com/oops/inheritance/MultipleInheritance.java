package com.oops.inheritance;

public class MultipleInheritance implements InterfaceA, InterfaceB {

	@Override
	public void print() {
		System.out.println("Printing");
	}
	
	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.print();
	}

}
