package StepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Plus500TestBase;
import Pages.*;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;


public class Plus500Steps extends Plus500TestBase {
	
	LoginPage lp;
	Homepage hp;
	
	@Before 
	public void setUp() throws IOException{ 
		
		Initialize();
		CreateReport();
				
	  } 
	@After 
	public void teardown(Scenario scenario) throws IOException {
		 
		if (scenario.isFailed()) {
		    // Take a screenshot
		    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    String filename=new SimpleDateFormat("'failed_'yyyyMMddHHmmSS'.png'").format(new Date());
			File DestFile=new File(".\\Reports\\Screenshots\\"+filename);
			FileUtils.copyFile(screenshot, DestFile);
				
		}
		report.endTest(logger);
		report.flush();
	}
	
	@Given("^User on LoginPage$")
	public void user_on_LoginPage() throws Throwable {
		logger = report.startTest("user_on_LoginPage");
		lp = new LoginPage();
		assertTrue(Compare(driver.getTitle(),"Plus500 WebTrader | Leading CFD Platform | Online Trading"));
		lp.EnterDemoMode();
		
		
		
		try{
		//wait.until(ExpectedConditions.visibilityOf(lp.LoginTab));
		driver.findElement(By.linkText("Log in")).click();
		//lp.Click_LoginTab();
		}catch(Exception e) {
			
		}
		try{
			
			lp.Click_AlreadyHaveAccount();
			}catch(Exception e) {
				
		}
			
    
	}

	@When("^\"([^\"]*)\" and \"([^\"]*)\" entered$")
	public void and_entered(String username, String password) throws Throwable {
		  logger = report.startTest("Username and Password entered");
		  lp.EnterUsernamePassword(username, password);
	

	}

	@Then("^Login$")
	public void login() throws Throwable {
		logger = report.startTest("login");
		lp.Click_Login();
	}

	@Given("^User is on Homepage$")
	public void user_is_on_Homepage() throws Throwable {
		logger = report.startTest("user_is_on_Homepage");
		hp = new Homepage();
		Thread.sleep(5000);
		assertTrue(Compare(driver.getTitle(),"Plus500"));
		 
		   
	}

	@When("^Search for \"([^\"]*)\"$")
	public void search_for(String currencypair) throws Throwable {
		logger = report.startTest("search_for_currencypair"); 
		hp.EnterSearch(currencypair);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

	}

	@Then("^Assert Buy Sell Prices within \"([^\"]*)\" and \"([^\"]*)\"$")
	public void assert_Buy_Sell_Prices_within_and(float x, float y) throws Throwable {
		logger = report.startTest("assert_Buy_Sell_Prices");
		hp.CheckPriceRange(x, y);
	}


}
