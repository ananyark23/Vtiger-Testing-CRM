package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreateNewContactsPage;
import objectRepo.HomePage;

public class TC_006 extends BaseClass
{
	@Test(groups = {"Regression", "Sanity"})
	public void CON_003() throws Exception
		{
			
			HomePage hp =new HomePage(driver);
			hp.clickOnContactsMenu();
			CreateNewContactsPage cp = new CreateNewContactsPage(driver);
			cp.clickOnCreatingNewContactIcon();
	
			ContactsPage newContact = new ContactsPage(driver);
			newContact.createNewContact(eutil.getDataFromExcel("Contacts",7,1),
					eutil.getDataFromExcel("Contacts",7,2),
					eutil.getDataFromExcel("Contacts",7,3),
					eutil.getDataFromExcel("Contacts",7,4),
					eutil.getDataFromExcel("Contacts",7,5),
					eutil.getDataFromExcel("Contacts",7,6));
			
		}


}
