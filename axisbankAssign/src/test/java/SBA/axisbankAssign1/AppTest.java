package SBA.axisbankAssign1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import browserSetup.browser;
import library.pageLib;
import utilities.excel;
import utilities.screenshot;

//It is main driver class
    public class AppTest {
	browser b = new browser();
	pageLib p = new pageLib();
	
	excel e= new excel();
	screenshot s = new screenshot();
	WebDriver driver;

	@SuppressWarnings("static-access")
	@BeforeMethod //The annotated method will be run before each test method.
	public void beforeFunction() throws IOException, InterruptedException, AWTException
	{
		driver = b.driverSetup("https://www.axisbank.com/retail/calculators/fd-calculator");
		//enter the url of site
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(6000); 
		
		//There was a Window based pop-up while automating the test cases so Robot class was used to handle it.
		Robot robot=new Robot(); //Robot class is a java based utility which emulates the keyboard and mouse actions
		Dimension i = driver.manage().window().getSize();
		//To get the height and width of the screen
		int x =(i.getWidth()/4) +32;//356
		int y =(i.getHeight()/4)-10;//164
		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); //press left click
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); //release left click
		Thread.sleep(3000); 
		//notification closed
	}
	
	@SuppressWarnings("static-access")
	@Test //Marks a class or a method as a part of the test.
	public void testFunction() throws InterruptedException, IOException, AWTException
	{		
		Robot robot=new Robot(); 
		//This was again used to move the mouse to another position in the web-page as it was pointing to some other link
		Dimension i = driver.manage().window().getSize();
		//To get the height and width of the screen
		int x =(i.getWidth()/4)-300 ;//24
		int y =(i.getHeight()/4)+70;//244
		robot.mouseMove(x, y);
		Thread.sleep(4000); 
	    p.radioButtonFunction(driver); 	//radioButton function is called to click on senior citizen radio button
		p.fixedDepositFunction(driver);	//fixedDeposit function is called t select monthly payout
	    e.putDataExcel(driver);            //putDataExcel is called to create the excel sheet
		p.amountDepositFunction(driver);   //amountDeposit function is called or entering the amount and calculating details
		p.clickAnywhereFunction(driver);   //clickAnywhere function is called to update FD amount
		p.rateofInterestFunction(driver); 	//RateofInterest function is called for getting the rate of interest after updating maturity details
	    s.screenshotFunction(driver);     //Screenshot function is called for capturing the page
	}
	
	@AfterTest  //The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
	public void afterFunction()
	{
		driver.quit(); //Used to exit the browser
	}
	
}