package testng;

import org.testng.annotations.Test;

public class prioritytc {
	@Test(priority=4,enabled =false)
 public void  testngdemo1() {
		System.out.println("hi this is test1");
	 }
	@Test(priority=3)
	 public void  testngdemo2() {
			System.out.println("hi this is test2");
		 }
	@Test(priority=2)
	 public void  testngdemo3() {
			System.out.println("hi this is test3");
		 }
	@Test(priority=1)
	 public void  testngdemo4() {
			System.out.println("hi this is test4");
		 }
}
