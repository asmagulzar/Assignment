package Pages;
import Base.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;



public class HomePage extends ReusableMethods{
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//WebElements
	
	@FindBy(xpath = "//div[@data-code='destination' and @class='c197_group_item']")
	public WebElement Destination;
	
	@FindBy(xpath = "//li[@data-value='Alaska Cruises']")
	public WebElement AlaskaCruiseCheckBox;
	
	@FindBy(xpath = "//div[@class='c197_group_item' and @data-code='dates']//div[@class='e1']")
	public WebElement Dates;
	
	@FindBy(xpath = "//div[@class='c197_block -dates']//li[@data-year='2021' and @data-value='April']")
	public WebElement April2021;
	
	@FindBy(xpath= "//div[@data-code='destination']//a[@title='Apply']")
	public WebElement DestApplyButton;
	
	@FindBy(xpath= "//a[contains(text(),'Find a Cruise')]")
	public WebElement FindCruise;
	
	@FindBy(xpath= "//div[@class='c197_block -dates']//a[@title='Apply']")
	public WebElement DatesApplyButton;
	
	@FindBy(css = "#IPEinvL850 > map > area:nth-child(1)")
	public List<WebElement> PopUp;
	
	
	
	
	//Functions
	public boolean ValidatePage(String text1 , String text2) {
		if(text1.contentEquals(text2)) {
			logger.log(LogStatus.PASS, "User is on Homepage");
			return true;
		}else {
			logger.log(LogStatus.FAIL, "User is not on Homepage");
			return false;
		}
	}
	
	public void ClickDestination() {
		Click(Destination,"Destination Dropdown");
			
	}
	
	public void ClickAlaskaCruise() {
		Click(AlaskaCruiseCheckBox,"Alaska Cruise CheckBox");
	}
	
	public void ClickDates() {
		Click(Dates,"Dates Dropdown");
	}
	
	public void ClickApril2021() {
		Click(April2021,"April 2021 Date");
		
	}
	
	public void ClickDestApply() {
		Click(DestApplyButton,"Destination Apply button");
				
	}
	
	public void ClickDatesApply() {
		Click(DatesApplyButton,"Dates Apply button");
		
	}
	
	public void ClickFindCruise() {
		Click(FindCruise,"FindCruise button");
		
	}
	
	public boolean PopupExists() {
		
		boolean Popup = driver.findElements(By.cssSelector("#IPEinvL850 > map > area:nth-child(1)")).size() > 0;
		return Popup;
	}
	
	
}
