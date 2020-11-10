package Base;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReusableMethods extends TestBase {
	
	public static ExtentTest logger;
	public static ExtentReports report;
	
	public void CreateReport() {
		//Extent Reports
		String fileName = new SimpleDateFormat("'NCLReport_'YYYYMMddHHmm'.html'").format(new Date());
		String path = "C:\\Users\\mehraj.g\\GitFolder\\Assignment\\NCL\\NCLReports\\" + fileName;
		report = new ExtentReports(path);
		
				
	}
	
	public void EnterText(WebElement element, String text, String objName) {
		if (element == null || !element.isDisplayed()) {
			logger.log(LogStatus.ERROR, objName + " Textbox is not found.");
		} else {
			logger.log(LogStatus.INFO, objName + " Textbox is found");
			element.sendKeys(text);
		}
		
	}
	
	public void Click(WebElement element, String objName) {
		if (element == null || !element.isDisplayed()) {
			logger.log(LogStatus.ERROR, objName + " Element is not found.");
		} else {
			logger.log(LogStatus.INFO, objName + " Element is found");
			element.click();
		}
	}
	
	public boolean Compare(String text1,String text2) {
		if(text1.contains(text2)) {
			logger.log(LogStatus.PASS,text1+" and "+text2+" are a match");
			return true;
			
		}else {
			logger.log(LogStatus.FAIL,text1+" and "+text2+" are a match");
			return false;
		}
	}
	
	
	
}
