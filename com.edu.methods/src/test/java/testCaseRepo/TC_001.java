package testCaseRepo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001  extends BaseClass
{
	@Test(groups= {"Smoke","Sanity"})
	public void LE_001() throws Exception
	{
		HomePage hp =new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lp =new LeadsPage(driver);
		lp.clickOnCreateNewLeadIcon();
		
		CreatingNewLeadPage newlead = new CreatingNewLeadPage(driver);
		newlead.createNewLead(eutil.getDataFromExcel("Leads",1,1),
				eutil.getDataFromExcel("Leads",1,2),
				eutil.getDataFromExcel("Leads",1,3));
		
	}

}

