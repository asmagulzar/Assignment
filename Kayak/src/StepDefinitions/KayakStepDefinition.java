package StepDefinitions;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.KayakTestBase;
import Pages.FlightsPage;
import Pages.FlightsSearchPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KayakStepDefinition extends KayakTestBase{
	
	FlightsPage fPage;
	FlightsSearchPage fsPage;
	
	@Before 
	public void setUp() throws IOException{ 
		
		Initialize();
		CreateReport();
			
		
	   } 
	@After 
	public void teardown() throws IOException {
		 
		driver.close();
		report.endTest(logger);
		report.flush();
	}
	
	@Given("^User On Kayak Website \"([^\"]*)\"$")
	public void user_On_Kayak_Website(String TestName) throws Throwable {
		logger = report.startTest(TestName);
		fPage = new FlightsPage();
		driver.get("https://www.kayak.com/flights");
	    
	}

	@When("^\"([^\"]*)\" and \"([^\"]*)\" cities are entered$")
	public void and_cities_are_entered(String origincity, String destcity) throws Throwable {

		fPage.EnterOrigin(origincity);
		fPage.EnterDestination(destcity);
		
		Thread.sleep(2000);
			
	}

	@When("^\"([^\"]*)\" and \"([^\"]*)\" airports are selected$")
	public void and_airports_are_selected(String arg1, String arg2) throws Throwable {
		System.out.println("Working"+arg1+arg2);
	}

	@When("^\"([^\"]*)\" and \"([^\"]*)\" dates are selected$")
	public void and_dates_are_selected(String Departure, String Return) throws Throwable {
		fPage.EnterDepartDate(Departure);
		fPage.EnterReturnDate(Return);
		
	}

	@Then("^Click Search And Validate SearchPage$")
	public void click_Search_And_Validate_SearchPage() throws Throwable {
		System.out.println("Working");
	}

	@When("^Search Result \"([^\"]*)\" is selected$")
	public void search_Result_is_selected(String arg1) throws Throwable {
		System.out.println("Working"+arg1);
	}

	@Then("^Validate Origin and Destination$")
	public void validate_Origin_and_Destination() throws Throwable {
		System.out.println("Working");
	}


}

