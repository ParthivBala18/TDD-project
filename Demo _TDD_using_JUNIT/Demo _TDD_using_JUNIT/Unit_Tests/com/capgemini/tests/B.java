package com.capgemini.tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({SlowTests.class,FastTests.class})

public class B {
	@Test
	public void c(){
		System.out.println("Inside class B c method ");
	}
	
}
