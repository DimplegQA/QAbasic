package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

// id
// class name
// name
// linktext
//xpath
//tagname



public class Applicationproperty {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Pictures\\javabasic\\resource\\chromedriver.exe");
		//webDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.get("https://www.amazon.com/");
		//driver.close();
		// String b="https://www.seleniumhq.org";
		// String a=driver.getCurrentUrl();
		// System.out.println("given URL: "+b);
		 
		 //URL
		String  currentUrl = driver.getCurrentUrl();	 
		 System.out.println("currentURL :"+currentUrl);
		  
		 
		 String pagename =driver.getTitle();
		 System.out.println(pagename);
	 //Title
	//String Title = driver.getTitle();
	 //System.out.println("Title :"+Title);
	
		 // pagesource
		String pagesource = driver.getPageSource();
	System.out.println("pagesource"+pagesource);
		 //driver.quit();
		 //driver.close();
	}
}
