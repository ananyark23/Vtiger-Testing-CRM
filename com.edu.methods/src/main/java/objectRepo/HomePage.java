package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class HomePage 
{
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Contacts']")
	private WebElement contactsMenu;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOut;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() 
	{
		return leadsMenu;
	}

	public WebElement getContactsMenu() 
	{
		return contactsMenu;
	}

	public WebElement getAccountIcon() 
	{
		return accountIcon;
	}

	public WebElement getSignOut() 
	{
		return signOut;
	}
	
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();
	}
	public void clickOnContactsMenu()
	{
		getContactsMenu().click();
	}
	
	public void logoutOperation(WebDriver driver)
	{
		SeleniumUtility sutility =new SeleniumUtility();
		sutility.mouseHovering(driver,getAccountIcon());
		getSignOut().click();
		
	}
}
