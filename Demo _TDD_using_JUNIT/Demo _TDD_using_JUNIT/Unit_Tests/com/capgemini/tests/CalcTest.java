/**
 * 
 */
package com.capgemini.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.capgemini.app.Calculator;

/**
 * @author DELL
 *
 */
public class CalcTest {
	
	public static Calculator calc; 

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	calc = new Calculator();
	System.out.println("This will execute only once..");
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
	System.out.println("The job ref variable calc is done..");
	
	}
	/**
	 * Test method for {@link com.capgemini.app.Calculator#modulus(int, int)}.
	 */
	@Test
	public void testModulus() {
		assertEquals(0,calc.modulus(3,3));
	}

	
	@Ignore
	@Test
	public void testSum() {
		assertEquals(24,calc.sum(12,12));
	}

	/**
	 * Test method for {@link com.capgemini.app.Calculator#product(int, int)}.
	 */
	@Test
	public void testProduct() {
		assertEquals(24,calc.product(2,12));
	}

	/**
	 * Test method for {@link com.capgemini.app.Calculator#difference(int, int)}.
	 */
	@Test
	public void testDifference() {
		assertEquals(24,calc.difference(45,21));
	}

	/**
	 * Test method for {@link com.capgemini.app.Calculator#divison(int, int)}.
	 */
	@Test
	public void testDivison() {
		fail("Not yet implemented");
	}

}
