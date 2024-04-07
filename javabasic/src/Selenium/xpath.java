package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class xpath{
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\QAbasic\\javabasic\\resource\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//C:\Users\DELL\eclipse-workspace\TEST\res\sel\chromedriver - Copy.exe
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("dimple");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("dimple");
		WebElement day=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		dropdownfb.abc(month, "Mar");
		dropdownfb.abc(day, "14");
		dropdownfb.abc(year, "2020");
		dropdownfb.abc(month, "Jun");}
public static void abc(WebElement info,String txt) {
	Select drop= new Select(info);	
drop.selectByVisibleText(txt);
}}