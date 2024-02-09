package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test12 {
	    public static void main(String[] args) throws InterruptedException {
	    	
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(opt);
			driver.get("https://www.costco.com/pharmacy/warehouse-pickup");
			//id 
			//name 
			//linktext
			//xpath
			driver.findElement(By.id("Home_Ancillary_0")).click();
			driver.findElement(By.linkText("Costco Next")).click();
			driver.navigate().to("https://www.w3schools.com/");
			driver.findElement(By.id("navbtn_tutorials")).click();	    }
	    }
		


