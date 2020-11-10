package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.KayakTestBase;

public class FlightsPage extends KayakTestBase {

	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//div[contains(@id,'-origin-airport-display-multi-container')]/div[@role='listitem' and contains(@class,'js-selection')]/div[@class='_iac _irF _Hk _h-8']")
	@FindBy(xpath = "//div[@class='search-form-inner']//div[@class='_iac _irF _Hk _h-8']")
	public WebElement originclose;
	
	@FindBy(xpath="//div[contains(@id,'-destination-airport-display-multi-container')]/div[@role='listitem' and contains(@class,'js-selection')]/div[@class='_iac _irF _Hk _h-8']")
	public WebElement destclose;
	
	@FindBy( xpath ="//div[@class='search-form-inner']//div[@data-placeholder='From?']")
	public WebElement origin1;
	
	@FindBy( xpath ="//input[@name='origin' and @placeholder='From?']")
	public WebElement origin2;
	
	@FindBy( xpath ="//div[@class='search-form-inner']//div[@data-placeholder='To?']")
	public WebElement destination1;
	
	@FindBy( xpath ="//input[@name='destination' and @placeholder='To?']")
	public WebElement destination2;
	
	@FindBy(xpath="//div[@class='search-form-inner']//div[contains(@class,'startDate')]")
	public WebElement DepartDate1;
	
	@FindBy(xpath="//div[@class='search-form-inner']//div[@aria-label='Departure date input']")
	public WebElement DepartDate2;
	
	@FindBy(xpath="//div[@class='search-form-inner']//div[@data-placeholder='Return']")
	public WebElement ReturnDate;
	
	
	public void EnterOrigin(String origincity ) throws InterruptedException {
		originclose.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("origin")));
		origin2.sendKeys(origincity);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-apicode='MIA']")));
		origin2.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='search-form-inner']//div[@data-value='MIA']")));
	}	
	public void EnterDestination(String destcity ) throws InterruptedException {
		
		destination1.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("destination")));
		destination2.sendKeys(destcity);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-apicode='NYC']")));
		destination2.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='search-form-inner']//div[@data-value='NYC']")));
		
				
	}	
	
	public void EnterDepartDate(String Departure) throws InterruptedException {
		
		DepartDate1.click();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].textContent= arguments[1];",driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")),Departure);
		
		//DepartDate2.sendKeys(Departure);
		Thread.sleep(5000);
		
	}
	
	public void EnterReturnDate(String Return) {
		//ReturnDate.click();
		//ReturnDate.sendKeys(Return);
	}
}
