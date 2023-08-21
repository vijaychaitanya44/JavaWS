package com.qa.testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//@Listeners(com.qa.testng.listeners.TestNgListenersDemo.class)
public class TestngDemo1 {

	SoftAssert softAssert;
	
	@Test(groups="A")

	public void testcase1() {
		System.out.println("Test case one");
	}

	@Test(groups="A")

	public void testcase2() {
		System.out.println("Test case two");
	}

	@Test(groups="A")

	public void testcase3() {
		System.out.println("Test case three");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "testcase3")

	public void testcase4() {
		softAssert = new SoftAssert();
		System.out.println("Test case four");
		softAssert.assertTrue(false);
		softAssert.assertAll();
		
	}
}
