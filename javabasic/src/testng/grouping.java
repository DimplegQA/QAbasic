package testng;

import org.testng.annotations.Test;

public class grouping {
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Hi i am  in test1");
	}
	@Test(groups = "smoke")
	public void test2() {
		System.out.println("Hi i am  in test2");
	}
	@Test(groups = "regression")
	public void test3() {
		System.out.println("Hi i am  in test3");
	}
	@Test(groups = "regression")
	public void test4() {
		System.out.println("Hi i am  in test4");
	}
	@Test(groups = "smoke")
	public void test5() {
		System.out.println("Hi i am  in test5");
	}
	@Test(groups = "smoke")
    public void testMethod1() {
        // Test logic
		System.out.println("this is smoke group");
    }

    @Test(groups = "regression")
    public void testMethod2() {
        // Test logic
    	System.out.println("this is regression group");
    }


}

