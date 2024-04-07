package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
	        WebDriver driver = new ChromeDriver(options);
		driver.get("file:///C:/Users/DELL/Desktop/loginform/loginformsample.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("dimple");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
       Thread.sleep(4000);
    
    driver.switchTo().alert().accept();
       Thread.sleep(4000);
       
    //  driver.close();
	}

}
