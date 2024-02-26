package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class googleSerach {
	WebDriver driver = null;
	@Given("browser is open")
	public void browser_is_open() {
	System.out.println("browser is open");
	String path=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Pictures/QAjavaCu/src/test/resources/Driver/chromedriver - Copy.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}

	@And("user is on google page")
	public void user_is_on_google_page() {
	System.out.println("user is on google page");
	driver.navigate().to("https://google.com");
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
	System.out.println("user enter a text in search box");
	driver.findElement(By.name("q")).sendKeys("Java");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user can navigate realted result")
	public void user_can_navigate_realted_result() {
	System.out.println("user can navigate realted result");	
	
	}

}
