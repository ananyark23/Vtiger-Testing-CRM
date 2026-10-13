package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	// locating the WebElements
	@FindBy(name = "user_name")
	private WebElement usernameTextField;
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement passwordTextField;
	@FindBy(id = "submitButton")
	private WebElement loginBTn;
	
	//initializing the WebElements
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);;
	}
	// Getter Methods 

	public WebElement getUsernameTextField() 
	{
		return usernameTextField;
	}

	public WebElement getPasswordTextField() 
	{
		return passwordTextField;
	}

	public WebElement getLoginBTn() 
	{
		return loginBTn;
	}
	
	// utilizing the WebElements
	
	public void loginToApplications(String UN, String PWD)
	{
		getUsernameTextField().sendKeys(UN);
		getPasswordTextField().sendKeys(PWD);
		getLoginBTn().click();
	}


}
