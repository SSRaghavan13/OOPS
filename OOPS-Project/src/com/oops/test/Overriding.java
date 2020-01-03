/*In Java, we can override methods only, 
 * not the variables(data members),
 * so runtime polymorphism cannot be 
 * achieved by data members*/

package com.oops.test;

class A 
{ 
    int x = 10;
    public void print() {
    	System.out.println('A');
    }
} 

class B extends A 
{
    int x = 20;
    public void print() {
    	System.out.println('B');
    }
}

public class Overriding {
	public static void main(String args[]) {
		A a = new B();
		System.out.println(a.x);
		a.print();
	}
}
