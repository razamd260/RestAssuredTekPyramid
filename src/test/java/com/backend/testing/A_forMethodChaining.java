package com.backend.testing;

public class A_forMethodChaining {
	/*
       // first Approch
	public void a() {
		System.out.println("Execute method a");
	}
	public void b() {
		System.out.println("Execute method b");
	}
	public void c() {
		System.out.println("Execute method c");
	}
	*/
	
	
	/*
	
	//  second Approch
	public A_forMethodChaining a() {
		System.out.println("Execute method Second ==> A");
		return new A_forMethodChaining();
	}
	
	public A_forMethodChaining b() {
		System.out.println("Execute method Second ==> B");
		return new A_forMethodChaining();
	}
	
	public A_forMethodChaining c() {
		System.out.println("Execute method Second ==> C");
		return new A_forMethodChaining();
	}
	
	*/
	
	//Third Approch
	public A_forMethodChaining a() {
		System.out.println("Execute method a");
		return new A_forMethodChaining();
	}
	
	public A_forMethodChaining b() {
		System.out.println("Execute method a");
		return new A_forMethodChaining();
	}
	
	public B_forMethodChaining c() {
		System.out.println("Execute method a");
		return new B_forMethodChaining();
	}
	
	
	
	/*
	public static A_forMethodChaining a() {
		System.out.println("Execute method a");
		return new A_forMethodChaining();
	}
	
	public static A_forMethodChaining b() {
		System.out.println("Execute method a");
		return new A_forMethodChaining();
	}
	
	public static B_forMethodChaining c() {
		System.out.println("Execute method a");
		return new B_forMethodChaining();
	}
	*/
	
	
}
