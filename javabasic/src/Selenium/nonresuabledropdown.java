package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class nonresuabledropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//C:\Users\DELL\eclipse-workspace\TEST\res\sel\chromedriver - Copy.exe
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		WebElement courseElement=driver.findElement(By.id("course"));
		
		Select a = new Select(courseElement);
		// value
		// index
		//visibletext
		
		/*Dropdown.selectByValue("net");
		System.out.println(Dropdown);
		Thread.sleep(4000);
		Dropdown.selectByIndex(1);
		System.out.println(Dropdown);
		Thread.sleep(4000);*/
		
			a.selectByVisibleText("Java");
			Thread.sleep(4000);
			a.selectByIndex(2);
			Thread.sleep(4000);
			a.selectByValue("js");
	}

}
