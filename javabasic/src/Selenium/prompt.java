package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class prompt {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
		        WebDriver driver = new ChromeDriver(options);
		        driver.manage().window().maximize();
			driver.get("C:\\Users\\DELL\\Desktop\\G.dimple\\logform1\\prompt.html");
			Thread.sleep(4000);
	        driver.findElement(By.xpath("/html/body/button")).click();
	        Thread.sleep(4000);	      
	        driver.switchTo().alert().dismiss();
	        driver.close();
	       
	        
	}

}
