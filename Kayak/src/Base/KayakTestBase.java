package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KayakTestBase {
	
	public static ExtentTest logger;
	public static ExtentReports report;
	public static WebDriver driver;
	public static Properties prop;
	public static Wait<WebDriver> wait;
	
	
	public static void Initialize() {
		String browserName = "chrome"; 

		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browserName.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
		} else {
			
			System.out.println("Invalid Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
	}
	
	public void CreateReport() {
		//Extent Reports
		String fileName = new SimpleDateFormat("'KayakReport_'YYYYMMddHHmm'.html'").format(new Date());
		String path = "C:\\Users\\mehraj.g\\GitFolder\\Assignment\\Kayak\\KayakReports\\" + fileName;
		report = new ExtentReports(path);
				
	}
	
	public static void EnterText(WebElement element, String text, String objName) {
		if (element == null || !element.isDisplayed()) {
			logger.log(LogStatus.ERROR, objName + " Textbox is not found.");
		} else {
			logger.log(LogStatus.INFO, objName + " Textbox is found");
			element.sendKeys(text);
		}
		
	}
	
	public static void Click(WebElement element, String objName) {
		if (element == null || !element.isDisplayed()) {
			logger.log(LogStatus.ERROR, objName + " Element is not found.");
		} else {
			logger.log(LogStatus.INFO, objName + " Element is found");
			element.click();
		}
	}
	
	public static boolean Compare(String text1,String text2) {
		if(text1.contains(text2)) {
			logger.log(LogStatus.PASS,text1+" and "+text2+" are a match");
			return true;
			
		}else {
			logger.log(LogStatus.FAIL,text1+" and "+text2+" are a match");
			return false;
		}
	}
	public static boolean CheckDisplayed(WebElement element,String objName) {
		if (element == null || !element.isDisplayed()) {
			logger.log(LogStatus.FAIL, objName + " is not displayed");
			return false;
		} else {
			logger.log(LogStatus.PASS, objName + " is displayed");
			return true;
		}
		
	}
	
}

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.DataProvider;
//import org.hamcrest.Matcher;
//import org.json.JSONArray;
//import org.json.JSONObject;
//@DataProvider
//public Object[][] getData() throws FileNotFoundException, IOException{
//	
//	XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream("./Resources/Data.xlsx"));
//	XSSFSheet myExcelSheet = myExcelBook.getSheet("Country Details");
//	XSSFRow row ; 
//	int totalRows = myExcelSheet.getLastRowNum();
//	
//	Object[][] data = new Object[totalRows][3];
//	 for (int i=1;i<=totalRows;i++) {
//		 row= myExcelSheet.getRow(i);
//		 for(int j=0;j<3;j++) {
//			 
//			 data[i-1][j] = row.getCell(j).getStringCellValue();
//		 }
//	 }
//	
//	return data;
//	
//	
//}

//JSONObject obj = new JSONObject(json);
//JSONArray jsonarray = new JSONArray(json);
//

//for (int i = 0; i < jsonarray.length(); i++) {
//	JSONObject jsonobject = jsonarray.getJSONObject(i);
//	String name = jsonobject.getString("name");
//	String capital = jsonobject.getString("capital");
//}
