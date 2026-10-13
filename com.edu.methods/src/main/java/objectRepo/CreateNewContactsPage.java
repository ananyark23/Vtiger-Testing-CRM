package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage {

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement creatingNewContactIcon;
	
	public CreateNewContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreatingNewContactIcon() {
		return creatingNewContactIcon;
	}
	
	public void clickOnCreatingNewContactIcon()
	{
		getCreatingNewContactIcon().click();
		
	}
	
}

