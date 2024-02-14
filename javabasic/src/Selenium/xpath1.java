package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.geckodriver.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\msedgedriver.exe");	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		   // WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		    driver.get("https://www.w3schools.com/");
		    driver.getTitle();
		    System.out.println( driver.getTitle());
		    
		  //  xpath
		    //absolute: / , rootnode
		    //relative
		    
		    
		    driver.findElement(By.xpath("/html/body/div[1]/a[3]")).click();
	}

}
