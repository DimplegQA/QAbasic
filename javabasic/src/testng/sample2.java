package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sample2 {
	


	@BeforeSuite
	public void add() {
		System.out.println("Beforesuite");
	}
	@AfterSuite
	public void add1() {
		System.out.println("Aftersuite");
	}
	@Test
	public void add2() {
		System.out.println(1+8+18);
	}
	@Test
	public void add3() {
		System.out.println("hello");
	}
	@Test
	public void add4() {
		System.out.println("hello");
	}
}
