import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedfinStepDefinition extends RedfinTestBase{
	
	
	@Before 
	public void setUp() throws IOException{ 
		ReadProperties();
		Initialize();
		CreateReport();
			
		
	   } 
	@After 
	public void teardown(Scenario scenario) throws IOException {
		 
		if(scenario.isFailed()) {
		      // Take a screenshot
		      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		      String filename=new SimpleDateFormat("'Failed_'yyyyMMddHHmmSS'.png'").format(new Date());
		      File DestFile=new File("C:\\Users\\mehraj.g\\GitFolder\\Assignment\\Redfin\\RedfinReports\\FailedScreenshots\\"+filename);
		      FileUtils.copyFile(screenshot, DestFile);
		}
		driver.close();
		report.endTest(logger);
		report.flush();
	}
	
	@Given("^User is on Redfin Homepage for \"([^\"]*)\"$")
	public void user_is_on_Redfin_Homepage_for(String TestName) throws Throwable {
		logger = report.startTest(TestName);
		driver.get(prop.getProperty("url"));
	}

	@Then("^Validate Homepage with \"([^\"]*)\"$")
	public void validate_Homepage_with(String PageTitle) throws Throwable {
		String a = PageTitle;
		String actualTitle = driver.getTitle();
		
		if(actualTitle.contains(PageTitle)) {
			logger.log(LogStatus.PASS, "User is on home page");
		}
		else {
			logger.log(LogStatus.FAIL, "User is not on home page");
		}
	}

	
	@Then("^Enter \"([^\"]*)\" In Search Box and press Enter$")
	public void enter_In_Search_Box_and_press_Enter(String City ) throws Throwable {
		WebElement SearchBox = driver.findElement(By.id("search-box-input"));
		EnterText(SearchBox,City,"Search Box");
		SearchBox.sendKeys(Keys.ENTER);
		
	}

	@Then("^Validate Popup$")
	public void validate_Popup() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Places')]")));
		WebElement Popup = driver.findElement(By.className("guts"));
		boolean result = CheckDisplayed(Popup,"Did You Mean - Pop Up");
		Assert.assertTrue(result);
		
	}

	@When("^On Popup select \"([^\"]*)\"$")
	public void on_Popup_select(String PopupCity) throws Throwable {
		System.out.println(PopupCity);
		List<WebElement> popuplist = driver.findElements(By.xpath("//a[@class='item-title block']"));
		
		for(int i=0;i<popuplist.size();i++) {
			
			if(popuplist.get(i).getAttribute("href").contains(PopupCity)) {
				System.out.println("match");
				popuplist.get(i).click();
				break; //break important or else stale element exception 
			}
		}
		
				
	}

	@Then("^Validate Real Estate Page as \"([^\"]*)\"$")
	public void validate_Real_Estate_Page_as(String RealEstatePage) throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Sunnyvale Homes for Sale')]")));
		if(driver.getTitle().contains(RealEstatePage)) {
			logger.log(LogStatus.PASS, "User is on page "+RealEstatePage);
		}
		else {
			logger.log(LogStatus.FAIL, "User is not on page "+RealEstatePage);
		}
	}

	@Then("^asserto Search Box has \"([^\"]*)\"$")
	public void asserto_Search_Box_has(String cityname) throws Throwable {
		
	  String searchtext =  driver.findElement(By.xpath("//div[@class='textContent']")).getText();
	  Assert.assertTrue(Compare(searchtext,cityname));
	  	   
	    }

	
	@When("^\"([^\"]*)\" and \"([^\"]*)\" are selected$")
	public void and_are_selected(String MinPrice, String MaxPrice) throws Throwable {
		WebElement select1 = driver.findElement(By.xpath("//span[@class='field select Select quickMinPrice withFlyout withOptions mounted selected clickable optional']"));
		select1.click();
		
		
		JavascriptExecutor je= (JavascriptExecutor) driver;
        je.executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@class='option' and @aria-label='"+MinPrice+"']")));
        
		
		WebElement select2 = driver.findElement(By.xpath("//span[@class='field select Select quickMaxPrice withFlyout withOptions mounted selected clickable optional']"));
		select2.click();
		
		
		
		
		je.executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@class='option' and @aria-label='"+MaxPrice+"']")));
		Thread.sleep(3000);
		

				
	}

	@Then("^Verify all homes are from \"([^\"]*)\"$")
	public void verify_all_homes_are_from(String SearchResult) throws Throwable {
		
		List<WebElement> houselist = driver.findElements(By.xpath("//div[@class='bottomV2']/a"));
		if(houselist.size()!=0) {
			for(WebElement w : houselist ) {
			
				Assert.assertTrue(Compare(w.getAttribute("href"),SearchResult));
			
			}
		}
		else {
			logger.log(LogStatus.ERROR,"No Data To Test");
		}
		
	}


}
