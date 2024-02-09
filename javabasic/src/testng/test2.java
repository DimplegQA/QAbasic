package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {
	static WebDriver driver;
@BeforeTest
public void openBrowser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
       WebDriver driver = new ChromeDriver(options);
       driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.switchTo().frame(0);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
	   driver.switchTo().defaultContent();
	  // driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/mobile-promo/div/div/div/div[2]/g-flat-button")).click();
	    driver.findElement(By.name("q")).sendKeys("amazon");
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();	
	    driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/div")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")).click();}

@Parameters({"username"})		
@Test()
public void input(String un) {
driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("un");}
	
   	@Test(enabled=true)
public void alert() {
	driver.manage().window().maximize();
	WebElement showAlert=driver.findElement(By.xpath("/html/body/button"));
	 showAlert.click();
}	
}
