package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragdrop {
	static WebDriver driver;
	 @BeforeTest
	    public void openbrowser() {
	        // Set the path to the chromedriver executable
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);	
			 driver.get("https://jqueryui.com/droppable/");
			 driver.manage().window().maximize();}
	 @Test
	 public void  drdp() throws InterruptedException {
		 driver.switchTo().frame(0);
		 WebElement drag1=driver.findElement(By.id("draggable"));
		 WebElement drop1=driver.findElement(By.id("droppable"));
		 Actions abc = new Actions(driver);
	abc.dragAndDrop(drag1, drop1).build().perform();
		//abc.dragAndDrop(drag1, drop1).build().perform();
		// obj.dragAndDrop(drag1, drop1).build().perform();
		 
		
		
		 Thread.sleep(4000);
		 driver.switchTo().defaultContent();}
		 //driver.close();
	 @Test
	 public void mouseover() throws InterruptedException {
		WebElement mv= driver.findElement(By.linkText("Resizable"));
		Actions abc = new Actions(driver);
		abc.moveToElement(mv).build().perform();
		//abc.moveToElement(mv).build().perform();
	//	WebElement mv1=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[3]/a"));
	//	abc.moveToElement(mv1).build().perform();
		Thread.sleep(4000);
	 }
		/* @Test
		 public void  moveto() throws InterruptedException {
		 WebElement moveto=driver.findElement(By.linkText("Droppable"));
		// Thread.sleep(4000);
		 Actions action = new Actions(driver);
		 action.moveToElement(moveto).build().perform();
		 Thread.sleep(4000);}
		 @AfterTest
		 public void af() {
		 driver.close();}
		// action.dragAndDrop(drag1, drop1).build().perform();
		// here with help of action class we performing drag and drop 
		// driver.switchTo().defaultContent();
		 //move to element
//		 action.moveToElement(link).build().perform();	  */
	 
}
