package testng;

import static org.testng.Assert.assertTrue;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dummy {
	 WebDriver driver;

	  @BeforeTest
	  //@Parameters("browserName")
	  public void InitialiseBrowser(){
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
				//webDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				 driver = new ChromeDriver(options);
				
  }

	 @Test(priority=1)
		@Parameters("url4")
		public void test1(String url) {
			driver.get(url);
			System.out.println("Page title is :"+driver.getTitle());
		}

	  

	  @Test (priority=2)

	  public void EnterLoginDetail() throws InterruptedException {
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//input[@id='input-number']")).sendKeys("3");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//input[@id='input-text']")).sendKeys("mili");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("patel");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//input[@id='input-date']")).sendKeys("12/12/2020");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//button[@id='btn-display-inputs']")).click();

		  Thread.sleep(4000);

	}

	  @Test(priority=3)

	  public void navigateToDemos() {

		  driver.findElement(By.xpath("//a[@id='examples-dropdown']")).click();

	}

	  @Test(priority=4)

	  public void verifyLogo() {

		WebElement eleselected=driver.findElement(By.xpath("//a[@class='navbar-brand p-0 me-2 logo_title']"));

		assertTrue(eleselected.isDisplayed());

		//assertTrue(eleselected.getText());

		driver.quit();

	  }

		

	
}
