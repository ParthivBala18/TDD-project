package com.capgemini.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	MyProductAnotherTest.class,
	MyCustomTests.class
})

public class MySuiteTest {

	}


