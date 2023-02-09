package org.abc.xyz;

public class ClassC extends ClassA{
	public void methodC() {
		System.out.println("ClassC - MethodC");
	}
	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.methodC();
		
	}
	
}
