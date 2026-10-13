package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage 
{
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstnameTextField;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastnameTextField;
	
	@FindBy(xpath = "//input[@name='department']")
	private WebElement departTextField;
	
	@FindBy(xpath = "//input[@name='title']")
	private WebElement titleTextField;
	
	@FindBy(id ="mobile")
	private WebElement mobileTextField;

	@FindBy(id ="email")
	private WebElement emailTextField;


	@FindBy(xpath = "//input[@name='mailingcity']")
	private WebElement mailingCityTextField;
	
	
	@FindBy(xpath = "//input[@name='mailingstate']")
	private WebElement mailingSateTextField;
	
	@FindBy(xpath = "//input[@name='mailingcountry']")
	private WebElement mailingCountryTextField;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveButton;
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getDepartTextField() {
		return departTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getMailingCityTextField() {
		return mailingCityTextField;
	}

	public WebElement getMailingSateTextField() {
		return mailingSateTextField;
	}

	public WebElement getMailingCountryTextField() {
		return mailingCountryTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	public void createNewContact(String lname, String title, String email, String mailCity, String mailState, String mailCountry)
	{
		getLastnameTextField().sendKeys(lname);
		getMailingCityTextField().sendKeys(mailCity);
		getTitleTextField().sendKeys(title);
		getEmailTextField().sendKeys(email);
		getMailingSateTextField().sendKeys(mailState);
		getMailingCountryTextField().sendKeys(mailCountry);
		getSaveButton().click();
		
	}
	public void createNewContact(String lname, String department,  String email, String mobile )
	{
		
		getLastnameTextField().sendKeys(lname);
		getDepartTextField().sendKeys(department);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	
	}
	
	public void createNewContact(String fname, String lname,  String title)
	{
		getFirstnameTextField().sendKeys(fname);
		getLastnameTextField().sendKeys(lname);
		getTitleTextField().sendKeys(title);
		getSaveButton().click();
}
}
