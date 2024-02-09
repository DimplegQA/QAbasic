package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firsttestng {
	@BeforeSuite
	public void testBs() {
	System.out.println("hi this Beforesuite");	
	}
	@AfterSuite
	public void testas() {
	System.out.println("hi this aftersuite");	
	}
	@AfterTest
	public void testat() {
	System.out.println("hi this afterTest");	
	}
	@AfterClass
	public void testAc() {
	System.out.println("hi this Afterclass");	
	}

	
	@BeforeMethod
	public void testBm() {
	System.out.println("hi this beforemethod");	
	}
	@AfterMethod
	public void testAm() {
	System.out.println("hi this Aftermethod");	
	}
	
	@Test
 public void  testngdemo1() {
		System.out.println("hi this is test1");
	 }
	@Test
	 public void  testngdemo2() {
			System.out.println("hi this is test2");
		 }
	
	@Test
	 public void  testngdemo3() {
			System.out.println("hi this is test3");}
		 
	@BeforeClass
	public void testBc() {
	System.out.println("hi this Beforeclass");	
	}
	@Test
	 public void  testngdemo4() {
			System.out.println("hi this is test4");
		 }
	@Test
	 public void  testngdemo5() {
			System.out.println("hi this is test5");
		 }	
	@BeforeTest
	public void testBT() {
	System.out.println("hi this beforetest");	
	}
}



