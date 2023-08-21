package com.qa.testng.listeners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Prerequisite {

	@BeforeSuite
	public void beforeSuite() {
		System.err.println("********************************Before SUITE");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After SUITE _________________________________");
	}
	@BeforeTest
	public void beforeTest() {
		System.err.println("********************************Before TEST");
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After TEST _________________________________");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.err.println("********************************Before METHOD");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After METHOD _________________________________");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.err.println("********************************Before GROUPS");
	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("After GROUPS _________________________________");
	}
	@BeforeClass
	public void beforeClass() {
		System.err.println("********************************Before CLASS");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After CLASS _________________________________");
	}
}
