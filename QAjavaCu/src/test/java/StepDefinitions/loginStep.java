package StepDefinitions;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*public class loginStep {

	WebDriver driver= null;
		@Given("user need to access the login page")
		public void UserIsOnloginPage() {
		    System.out.println("user is on login page");	
		    System.out.println("browser is open");
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver","C:/Users/DELL/Pictures/QAjavaCu/src/test/resources/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.navigate().to("https://practicetestautomation.com/practice-test-login/");}

		@When("^user enters (.*) and (.*)$")
		public void user_enters_userId_and_password(String userId ,String password) {
		   System.out.println("user is has enter the userId and password");
		   driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(userId);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		}
		@And("user need to click on login button")
		public void user_need_to_click_on_login_button() {
		   System.out.println("user is clicks on login button");
		   driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		}

		@Then("login page need to navigate to homepage")
		public void login_page_need_to_navigate_to_homepage() {
		 System.out.println("user is naviagted to homepage ");
		}

	}*/


