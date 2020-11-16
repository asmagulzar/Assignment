package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Base.*;

public class LoginPage extends Plus500TestBase {
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	//WebElements
	
	@FindBy(id = "demoMode")
	public WebElement Demo;
	
	@FindBy(id ="login" )
	public WebElement LoginTab;
	
	@FindBy(id ="newUserCancel" )
	public WebElement AlreadyHaveAccount;
	
	@FindBy(id ="email" )
	public WebElement Username;
	
	@FindBy(id ="password" )
	public WebElement Password;
	
	
	@FindBy(id ="submitLogin" )
	public WebElement LoginButton;
	
	//Methods
	
	public void EnterDemoMode() throws InterruptedException {
		Click(Demo,"Demo Button");
		
	}
	
	public void Click_LoginTab() {
		Click(LoginTab,"Login Tab");
	}
	
	public void Click_AlreadyHaveAccount() {
		Click(AlreadyHaveAccount,"AlreadyHaveAccount Link");
	}
	public void EnterUsernamePassword(String username,String password) {
		EnterText(Username,username,"Username");
		EnterText(Password,password,"Password");
	}
	
	public void Click_Login() {
		Click(LoginButton,"Login Button");
	}
	

	

}
