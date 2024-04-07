package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test12 {
	static WebDriver driver;
	@BeforeTest
	public void openbrowser() {
        // Set the path to the chromedriver executable
	 System.setProperty("webdriver.chrome.driver",".\\resource\\chromedriver.exe");
		//webDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);	
		 driver.get("file:///C:/Users/DELL/Desktop/loginform/loginformsample.html");
		 driver.manage().window().maximize();
	} 
	@Test
	public void username(){
		driver.findElement(By.id("username")).sendKeys("dimple");
		System.out.println("we can able to enter the text in the username textbox");
	}
	@Test
	public void password() {
		driver.findElement(By.id("password")).sendKeys("1234");
		System.out.println("we can able to enter the text in the password textbox");
	}
}
