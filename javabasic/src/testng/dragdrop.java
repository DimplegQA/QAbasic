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
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
			 // this related to go page
			// driver.get("https://jqueryui.com/droppable/");
			 driver.get("file:///C:/Users/DELL/Desktop/child.html");
			 driver.manage().window().maximize();}
	 @Test
	 public void  drdp() throws InterruptedException {
		// driver.switchTo().frame(0);
		 WebElement drag1=driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
		 WebElement drop1=driver.findElement(By.xpath("/html/body/div[2]"));
		 Thread.sleep(4000);
		 Actions o = new Actions(driver);
		o.dragAndDrop(drag1, drop1).build().perform();
		
		 Thread.sleep(4000);
		 driver.switchTo().defaultContent();}
		 //driver.close();
	 @Test
	 public void mouseover() throws InterruptedException {
		WebElement mv= driver.findElement(By.linkText("Selectable"));
		Actions b = new Actions(driver);
	b.moveToElement(mv).build().perform();
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
