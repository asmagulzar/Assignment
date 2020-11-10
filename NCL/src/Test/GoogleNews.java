package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.ReusableMethods;

public class GoogleNews extends ReusableMethods{
	@BeforeClass
	public void SetUp() {
		Initialize();
		CreateReport();
	}
	
	@AfterClass
	public void TearDown() {
		report.flush();
		driver.quit();
	}
	
	@Test
	public void GoogleTest() throws InterruptedException {
		
		driver.get("https://news.google.com/");
		driver.findElement(By.xpath("//input[@class = 'Ax4B8 ZAGvjd']")).sendKeys("nobel prize");
		driver.findElement(By.xpath("//input[@class = 'Ax4B8 ZAGvjd']")).sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='mggrR']")));
		String page = driver.findElement(By.xpath("//h2[@class='mggrR']")).getText();
		
		if(page.contains("Nobel Prizes")) {
			System.out.println("Landed on Nobel Prize page");
		}else {
			System.out.println("Not landed on Nobel Prize page");
		}
		
		Thread.sleep(5000);
		
		//List<WebElement> linklist = driver.findElements(By.xpath("//h3[@class='ipQwMb ekueJc RD0gLb']/a[contains(text(),'Nobel')]"));
		//List<WebElement> linklist = driver.findElements(By.xpath("(//main[@class = 'HKt8rc CGNRMc'])[2]//h3/a"));
		
		List<WebElement> linklist = driver.findElements(By.xpath("(//div[@class='lBwEZb BL5WZb xP6mwf'])[2]//h3/a"));
			
		System.out.println("Link 1 : "+linklist.get(0).getText());
		System.out.println("Link 2 : "+linklist.get(1).getText());
		

	}

}
