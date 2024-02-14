package com.testNg;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestNG {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Test before suite ");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Test before Method ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Test before Class ");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Test before Test ");
	}
	@Test (enabled=false)

	public void testLogin() {
		System.out.println("I am going to TestLogin");
	}

	@Test(priority=2)
	public void testUser() {
		System.out.println("Test as a testuser");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Test After suite ");
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("Test After Method ");
	}


	@AfterClass
	public void afterClass() {
		System.out.println("Test before Class ");
	}


	@AfterTest
	public void afterTest() {
		System.out.println("Test before Test ");

	}
	@Test(priority=1)
	public void testPass() {
		System.out.println("I am going to pass  the Test");


          }
 

}
