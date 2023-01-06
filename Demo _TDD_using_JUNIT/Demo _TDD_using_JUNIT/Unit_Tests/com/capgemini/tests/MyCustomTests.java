package com.capgemini.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyCustomTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(" hh");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("jj");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("qq");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("EE");
	}

	@Test
	public void testMyProduct() {
		
	}

}
