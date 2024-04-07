package testng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dummy1 {
	static WebDriver driver;

	  @Parameters("browserName")

	  @BeforeTest

	  public void InitialiseBrowser(String browserName ){

		  switch(browserName.toLowerCase()){

		  case"Chrome":

			  WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();

			  break;

		  case"edge":

			  WebDriverManager.edgedriver().setup();
				WebDriver driver1 = new EdgeDriver();


			  break;

		  case"firefox":

			 WebDriverManager.firefoxdriver().setup();
			 WebDriver driver2 = new FirefoxDriver();

			  break;

		  default:

			  System.err.println("browser name is invalid");

			  break;

			   }

		  driver.manage().window().maximize();

	  }

	  

	  @Parameters("url")

	  @Test

	  public void LaunchApp(String url) {

		driver.get("url");

	  }

	  

	  @Test 

	  public void EnterLoginDetail() throws InterruptedException {

		  driver.findElement(By.xpath("//input[@id='input-number']")).sendKeys("3");

		  driver.findElement(By.xpath("//input[@id='input-text']")).sendKeys("mili");

		  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("patel");

		  driver.findElement(By.xpath("//input[@id='input-date']")).sendKeys("12/12/2020");

		  driver.findElement(By.xpath("//button[@id='btn-display-inputs']")).click();

		  Thread.sleep(4000);

	}

	  @Test

	  public void navigateToDemos() {

		  driver.findElement(By.xpath("//a[@id='examples-dropdown']")).click();

	}

	  @Test

	  public void verifyLogo() {

		WebElement eleselected=driver.findElement(By.xpath("//a[@class='navbar-brand p-0 me-2 logo_title']"));

		assertTrue(eleselected.isDisplayed());

		//assertTrue(eleselected.getText());

		driver.quit();
}}
