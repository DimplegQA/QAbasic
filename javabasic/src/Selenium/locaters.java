package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locaters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		// ID   
		//name  
		//className 
		// Linktext 
		//xpath
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.findElement(By.className("gNO89b")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		//driver.navigate().refresh();
driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(4000);
driver.findElement(By.className("gNO89b")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Gmail")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Imag")).click();
		//driver.findElement(By.name("btnK")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.className("gNO89b")).click();
		/*driver.findElement(By.partialLinkText("ail")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Ima")).click();
		Thread.sleep(4000);
		driver.navigate().to("https://www.w3schools.com/");
		driver.findElement(By.id("navbtn_tutorials")).click();
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("more")).click();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//a[text()=\"Personal\"]")).click();
		driver.close();*/
		
		
		  ///    / rootnode
	}

}
