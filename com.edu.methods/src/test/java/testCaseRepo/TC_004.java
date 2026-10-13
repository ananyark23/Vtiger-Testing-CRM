package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreateNewContactsPage;
import objectRepo.HomePage;

public class TC_004 extends BaseClass
{
	@Test(groups ="Smoke")
	public void CON_001() throws Exception
	{
		
		HomePage hp =new HomePage(driver);
		hp.clickOnContactsMenu();
		CreateNewContactsPage cp = new CreateNewContactsPage(driver);
		cp.clickOnCreatingNewContactIcon();
		ContactsPage newContact = new ContactsPage(driver);
		newContact.createNewContact(eutil.getDataFromExcel("Contacts",1,1),
				eutil.getDataFromExcel("Contacts",1,2),
				eutil.getDataFromExcel("Contacts",1,3));
		
	}
}