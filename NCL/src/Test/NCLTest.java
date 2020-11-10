package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.LogStatus;

import Base.*;
import Pages.*;

public class NCLTest extends ReusableMethods{
	
	HomePage ho; VacationsPage vo;
	
	@BeforeClass
	public void SetUp() {
		Initialize();
		CreateReport();
	}
	
	@Test(priority=1)
	public void FindCruise() throws InterruptedException {
		logger = report.startTest("Login");
		ho = new HomePage();
		ho.ValidatePage(driver.getTitle(),"Cruises & Cruise Deals | Plan Your Cruise Vacation | NCL");
		boolean cont = true;
		
		while(cont) {
		try {
		wait.until(ExpectedConditions.visibilityOf(ho.Destination));
		ho.ClickDestination();
		wait.until(ExpectedConditions.visibilityOf(ho.AlaskaCruiseCheckBox));
		ho.ClickAlaskaCruise();
		wait.until(ExpectedConditions.visibilityOf(ho.DestApplyButton));
		ho.ClickDestApply();
		wait.until(ExpectedConditions.visibilityOf(ho.Dates));
		ho.ClickDates();
		wait.until(ExpectedConditions.visibilityOf(ho.April2021));
		ho.ClickApril2021();
		wait.until(ExpectedConditions.visibilityOf(ho.DatesApplyButton));
		ho.ClickDatesApply();
		ho.ClickFindCruise();
		cont = false;
		
			
		}catch(Exception e) {
			
		//	if(driver.findElements(By.cssSelector("#IPEinvL850 > map > area:nth-child(1)"))!=null) {
			if(ho.PopUp.size()>0) {
			WebElement popupclose = driver.findElement(By.cssSelector("#IPEinvL850 > map > area:nth-child(1)"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", popupclose);
			logger.log(LogStatus.INFO, "Popup closed");
			}
			driver.navigate().refresh();
		}
		}
	}
	
	@Test(priority=2)
	public void CheckPrice() throws InterruptedException {
		
		logger = report.startTest("CheckPrice");
		vo = new VacationsPage();
		
		Thread.sleep(6000);
		vo.ValidatePage(driver.getTitle(), "Cruises to Alaska");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		wait.until(ExpectedConditions.visibilityOf(vo.CruisePrice));
		String price = vo.getCruisePrice();
		wait.until(ExpectedConditions.visibilityOf(vo.DatesAndPrices));
		vo.ClickDatesAndPrices();
		vo.CheckPriceExists(price);

	}
	
	
	
	@AfterClass
	public void TearDown() {
		report.flush();
		driver.quit();
	}
	
	

}
