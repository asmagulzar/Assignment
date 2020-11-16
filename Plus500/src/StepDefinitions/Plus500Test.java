package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Plus500TestBase;
import Pages.Homepage;
import Pages.LoginPage;


public class Plus500Test extends Plus500TestBase {
	
	
	LoginPage lp = new LoginPage();
	Homepage hp = new Homepage();
	
	@BeforeClass
	public void setUp() throws IOException{ 
		
		Initialize();
		CreateReport();
						
	  } 
	@AfterClass 
	public void teardown() throws IOException {
		 
		driver.quit();
		report.endTest(logger);
		report.flush();
	}
	
	@Test
	public void Testing() throws InterruptedException {
		File directory = new File("./");
		System.out.println(directory.getAbsolutePath());


	}
}
