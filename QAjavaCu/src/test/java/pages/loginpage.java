package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	protected WebDriver driver;
 private By txt_userId = By.xpath("//*[@id=\"username\"]");
 private By txt_password = By.xpath("//*[@id=\"password\"]");
 private By txt_login  = By.xpath("//*[@id=\"submit\"]");
  
  public loginpage(WebDriver driver) {
	  this.driver = driver;
  }
  
public void enteruserId(String userId) {
	  driver.findElement(txt_userId).sendKeys(userId);
  }
  
  public void enterpassword(String password) {
	  driver.findElement(txt_password).sendKeys(password);
  }
  
  public  void clicklogin() {
	  driver.findElement(txt_login).click();
  }
}
