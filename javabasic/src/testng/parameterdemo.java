package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterdemo {
	static WebDriver driver;
	@BeforeTest
    public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(options);	
		}
	@Test
	@Parameters("url1")
	public void test1(String url) {
		driver.get(url);
		System.out.println("Page title is :"+driver.getTitle());
	}
	
	@Test
	@Parameters("url2")
	public void test2(String url) {
		driver.get(url);
		System.out.println("Page title is :"+driver.getTitle());
	}
	@Test
	@Parameters("url")
	public void test3(String url) {
		driver.get(url);
		System.out.println("Page title is :"+driver.getTitle());
	}
	@Test
	@Parameters({"x","y","z","h"})
	public void test2(int x,int y,int z,int r) {
		//driver.get(url);
		//System.out.println("Page title is :"+driver.getTitle());
		int c=x+y+z+r;
		System.out.println("add "+c);
	}
	@AfterTest
	public void close() {
		driver.quit();
	}
}
