package com.capgemini.tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class A {
	
	@Test
	public void a(){
		System.out.println("Inside classs A a method");
	}
	@Category(SlowTests.class)
	@Test
	public void b(){
		System.out.println("Inside class A B method");
	}

}
