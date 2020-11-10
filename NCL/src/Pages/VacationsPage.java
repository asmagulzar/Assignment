package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import Base.*;

public class VacationsPage extends ReusableMethods {
	
	ReusableMethods r = new ReusableMethods();
	
	public VacationsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	//WebElements
	
	@FindBy(xpath = "//div[@class='e55_price_value']/span")
	public WebElement CruisePrice;
	
	@FindBy(linkText = "VIEW DATES & PRICES")
	public WebElement DatesAndPrices;
	
	@FindBy(xpath ="//div[@class='c165_body']//span[contains(@class,'headline')]") 
	public List<WebElement> CruisePriceList;
	
		
	
	//Functions
	public boolean ValidatePage(String text1 , String text2) {
		if(text1.contentEquals(text2)) {
			logger.log(LogStatus.PASS, "User is on Vacations Page");
			return true;
		}else {
			logger.log(LogStatus.FAIL, "User is not on Vacations Page");
			return false;
		}
	}
	
	public String getCruisePrice() {
		return CruisePrice.getText();
	}
	
	public void ClickDatesAndPrices() {
		Click(DatesAndPrices,"Dates And Prices");
	}
	
	public void CheckPriceExists(String price) {
		boolean match = false;
		for(WebElement ele :  CruisePriceList) {
							
				if(ele.getText().contains(price)){
					match = true;
					break;
				}
		}
		if(match) {
			logger.log(LogStatus.PASS, "Prices Match");
		}else {
			logger.log(LogStatus.FAIL, "Prices don't Match");
		}
	}
	
	

}
