package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2testng {
	static WebDriver driver;
@BeforeTest
public void openbrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(options);		
        driver.manage().window().maximize();
	 driver.get("https://accounts.google.com/InteractiveLogin/identifier?elo=1&ifkv=AQMjQ7Rsun0sWgQAzQjJ0cr1KMoxFnkNZt10mPQQzqTmBCp1yyjm6vZdfrMKlpqFxArTkiY5Qjq9&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
driver.manage().window().maximize();
}

@Test
public void mail() {
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("dimpleg@gmail.com");
    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
}

@Test(priority=2)
public void mail1() {
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Selenium@123");
    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
}

	}

