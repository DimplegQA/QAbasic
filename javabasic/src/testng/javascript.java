package testng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javascript {
	static WebDriver driver;
	 @BeforeSuite
	    public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver",".\\resource\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
			 driver.manage().window().maximize();
			 driver.get("https://www.dell.com/en-in/shop/deals/laptop-deals?gacd=10415953-9016-5761040-285981356-0&dgc=ST&gclid=CjwKCAjw2K6lBhBXEiwA5RjtCeaG_KflhMJoDoHoS0hQsYqf7-n5YL4RaOTqJbARvxq57rf21qkDqBoCeAAQAvD_BwE&gclsrc=aw.ds");}
	
	 @Test
	 public void dimple() throws InterruptedException {		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;	
		 js.executeScript("window.scrollBy(0,4000);");
		 Thread.sleep(4000);}
	 @Test
	 public void dimple1() throws InterruptedException {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeAsyncScript("alert('Welcome dimple');");
		 //Thread.sleep(4000);
		 js.executeScript("alert('accept')");
		Thread.sleep(2000);;
	 }
	 
	 @AfterTest
	 public void closebrowser() {
		 driver.close();
	 }
}
