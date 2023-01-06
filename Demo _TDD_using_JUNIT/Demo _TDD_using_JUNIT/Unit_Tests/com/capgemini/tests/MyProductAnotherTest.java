
package com.capgemini.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.capgemini.app.MyProduct;

@RunWith(Parameterized.class)
public class MyProductAnotherTest {

	@Parameter(0)
	public static int i;

	@Parameter(1)
	public static int j;

	@Parameter(2)
	public static int result;

	//Create test data
	@Parameters
	public static Collection <Object[]>data() throws Exception{
		Object[][] data = new Object[][] { {1,2,2},{2,3,6},{5,4,20}};

		return Arrays.asList(data);
	}
	@Test
	public void testProduct() throws Exception{
		MyProduct prod = new MyProduct();
		assertEquals(result,prod.product(i, j));
	}
}