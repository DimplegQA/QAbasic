package library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import library.homeLib;
import utilities.excel;

public class pageLib {
	//Senior citizen radio button clicked
	public void radioButtonFunction(WebDriver driver)
	{
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    
		 //The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time
		 driver.findElement(By.xpath(homeLib.Radio)).click();              
		 //Clicking on the senior citizen radio button on the Web-page
	}
	
	//Monthly Payout selected in the Fixed Deposit drop-down
	public void fixedDepositFunction(WebDriver driver)
	{		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   //Implicit wait
		Select s=new Select(driver.findElement(By.xpath(homeLib.Type)));  
		//Selecting monthly payout option from drop-down using select
	    s.selectByValue("Monthly Payout");	 //Select by value	
	}
	
	//Rs.40000 entered into the Amount Deposit text-box
	public void amountDepositFunction(WebDriver driver) throws IOException, InterruptedException
	{
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      //Implicit wait   
		String am=	excel.getDataExcel();                            
		//Obtaining the value from the excel and storing it in the string
		driver.findElement(By.xpath(homeLib.Amount)).clear();          	//Clearing the amount textbox
        Thread.sleep(3000);                                                 //Increasing the wait time
        driver.findElement(By.xpath(homeLib.Amount)).sendKeys(am);         //Entering the amount
	    driver.findElement(By.xpath(homeLib.Amount)).sendKeys(Keys.ENTER); //For pressing Enter key over a textbox 
	}
	
	//click anywhere on web page
		public void clickAnywhereFunction(WebDriver driver)
		{
			driver.findElement(By.xpath(homeLib.ClickAnywhere)).click();     //Clicking anywhere in the screen to get updated "FD Maturity Details"
		}
		
	//Rate of interest printed
	public void rateofInterestFunction(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      //Implicit wait
		String Rate=driver.findElement(By.xpath(homeLib.Rate)).getText();    //Getting the rate of interest after updating maturity details
		System.out.println("The Rate of Interest is: " +Rate);                //Printing the rate of interest in the console
	}
}
