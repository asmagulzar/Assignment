package Pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import Base.*;

public class Homepage extends Plus500TestBase {
	
	public Homepage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//WebElements
	
	@FindBy(xpath = "//input[@id='main-search-input']")
	public WebElement SearchBox;
	
	@FindBy(xpath = "//span[@id='_win_bind4053']")
	public WebElement SellPrice;
	
	@FindBy(xpath = "//span[@id='_win_bind4056']")
	public WebElement BuyPrice;
	
	//Methods
	
	public void EnterSearch(String currencypair) {
		EnterText(SearchBox,currencypair,"Search Box");
	}

	public void CheckPriceRange(float x,float y) {
		if(x>=1.2 && x<=1.4) {
			logger.log(LogStatus.PASS, "SellPrice within range of "+x+" and "+y);
		}
		if(y>=1.2 && y<=1.4) {
			logger.log(LogStatus.PASS, "BuyPrice within range of "+x+" and "+y);
		}
	}
}
