package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mulwindows {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);//C:\Users\DELL\eclipse-workspace\TEST\res\sel\chromedriver - Copy.exe
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
				     //driver.switchTo().defaultContent();

		    	   }
		       driver.switchTo().defaultContent().close();
		}
	}


