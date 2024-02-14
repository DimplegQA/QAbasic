package Selenium;

import java.util.Iterator;
import java.util.Set;

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
	    	
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(opt);
		
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("newWindowsBtn")).click();
	        //Thread.sleep0("4000");
	        String mainWindow=driver.getWindowHandle();//parent
	        Set<String> set=driver.getWindowHandles();
	       Iterator<String>itr=set.iterator();
	       while(itr.hasNext())
	       {
	    	   String childWindow=itr.next();  //child
	    	   if(!mainWindow.equalsIgnoreCase(childWindow)) {
	    		   driver.switchTo().window(childWindow);
	    		   System.out.println(driver.switchTo().window(childWindow).getTitle());
	    		   driver.manage().window().maximize();	    		   
	    		   driver.close();
	    	   }
			     

	    	   }
	       driver.switchTo().defaultContent();
	       driver.close();
	    }
	    }
		


