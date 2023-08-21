package com.qa.testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//@Listeners(com.qa.testng.listeners.TestNgListenersDemo.class)
public class TestngDemo2 {

	SoftAssert softAssert;
	
	@Test

	public void testcase5() {
		System.out.println("Test case 5");
	}

	@Test

	public void testcase6() {
		System.out.println("Test case 6");
	}

	@Test

	public void testcase7() {
		System.out.println("Test case 7");
		Assert.assertTrue(false);
	}
	
	@Test

	public void testcase8() {
		softAssert = new SoftAssert();
		System.out.println("Test case 8");
		softAssert.assertTrue(false);
		softAssert.assertAll();
		
	}
}
