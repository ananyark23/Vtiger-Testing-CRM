package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class CreatingNewLeadPage 
{
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstnameTextField;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastnameTextField;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyTextField;

	@FindBy(id = "designation")
	private WebElement titleTextField;

	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSourceTextField;
	
	@FindBy(xpath = "//input[@id='noofemployees']")
	private WebElement noOfEmployeesTextField;
	
	@FindBy(id ="mobile")
	private WebElement mobileTextField;

	@FindBy(id ="email")
	private WebElement emailTextField;
	
	@FindBy(id ="city")
	private WebElement cityTextField;
	
	@FindBy(id ="state")
	private WebElement stateTextField;

	@FindBy(id ="country")
	private WebElement countryTextField;
	
	@FindBy(xpath = "(//input[@accesskey='S'])[2]")
	private WebElement saveBtn;
	

	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getLeadSourceTextField() {
		return leadSourceTextField;
	}

	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createNewLead( String fname, String lname,  String compamy)
	{
		getFirstnameTextField().sendKeys(fname);
		getLastnameTextField().sendKeys(lname);
		getCompanyTextField().sendKeys(compamy);
		getSaveBtn().click();
	}
	
	public void createNewLead(String lname, String company, String title ,String leadsource, String noOFEmp )
	{
		getLastnameTextField().sendKeys(lname);
		getCompanyTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		new SeleniumUtility().selectOptionByValue(getLeadSourceTextField(), leadsource);
		getNoOfEmployeesTextField().sendKeys(noOFEmp);
		getSaveBtn().click();
		
	}
	
	public void createNewLead(String lname, String company, String mobile, String email, String city, String state)
	{
		getLastnameTextField().sendKeys(lname);
		getCompanyTextField().sendKeys(company);
		getMobileTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getCityTextField().sendKeys(city);
		getStateTextField().sendKeys(state);
		getSaveBtn().click();
		
	}
}
