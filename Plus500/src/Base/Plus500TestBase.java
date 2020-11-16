package Base;

import java.io.FileInputStream;
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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Plus500TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Wait<WebDriver> wait;
	public static ExtentTest logger;
	public static ExtentReports report;
	
public void Initialize() {
		
		
		String PropFilePath = ".\\Plus500Config.properties";
		FileInputStream fileIn;
		
		try {
			fileIn = new FileInputStream(PropFilePath);
			Properties prop = new Properties();
			prop.load(fileIn);
			System.getProperties().putAll(prop);
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		String browserName = System.getProperty("browser");
		String url =System.getProperty("url");
		
		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
		} else if (browserName.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
		} else if (browserName.equals("ie")) {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
			
		}else {
			
			System.out.println("Invalid Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
	}
public void CreateReport() {
	//Extent Reports
	String fileName = new SimpleDateFormat("'Plus500Report_'YYYYMMddHHmm'.html'").format(new Date());
	String path = ".\\Reports\\" + fileName;
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
	if(text1.equals(text2)) {
		logger.log(LogStatus.PASS,text1+" and "+text2+" are a match");
		return true;
		
	}else {
		logger.log(LogStatus.FAIL,text1+" and "+text2+" are a match");
		return false;
	}
}


}
