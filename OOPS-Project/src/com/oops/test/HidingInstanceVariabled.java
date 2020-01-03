package com.oops.test;

class HidingInstanceVariabled {
	
	int x = 20;
	void print() {
		int  x = 40;
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		HidingInstanceVariabled obj = new HidingInstanceVariabled();
		obj.print();
	}
}