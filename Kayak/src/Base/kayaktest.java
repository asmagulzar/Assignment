package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class kayaktest extends KayakTestBase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Initialize();
		driver.get("https://www.kayak.com/flights");
		EnterDepartDate("10/20/2020");
		
	
		
	}
	
	public static void EnterDepartDate(String Departure) throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='search-form-inner']//div[contains(@class,'startDate')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By))
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].contenteditable= true];",driver.findElement(By.xpath(""),Departure);
		
		//DepartDate2.sendKeys(Departure);
		Thread.sleep(5000);
		driver.close();
	}

}
