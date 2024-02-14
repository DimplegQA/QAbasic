package javabasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class testdemo12 {
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
			//webDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
			driver.manage().window().maximize();
			WebElement  b =driver.findElement(By.id("course"));
			Select a = new Select(b);
			//value
			//index
			//visib
			a.selectByValue("net");
			Thread.sleep(4000);
			a.selectByVisibleText("Java");
			Thread.sleep(4000);
		a.selectByIndex(4);
			}}