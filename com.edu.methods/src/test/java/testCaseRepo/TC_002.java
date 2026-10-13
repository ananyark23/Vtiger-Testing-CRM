package testCaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

public class TC_002 extends BaseClass 
{
	@Test(groups = "Regression")
	public void LE_002() throws Exception
	{
		HomePage hp =new HomePage(driver);
			hp.clickOnLeadsMenu();
			LeadsPage lp =new LeadsPage(driver);
			lp.clickOnCreateNewLeadIcon();
			CreatingNewLeadPage newlead = new CreatingNewLeadPage(driver);
			newlead.createNewLead(eutil.getDataFromExcel("Leads",4,1),
					eutil.getDataFromExcel("Leads",4,2),
					eutil.getDataFromExcel("Leads",4,3),
					eutil.getDataFromExcel("Leads",4,4),
					eutil.getDataFromExcel("Leads",4,5));
			
		}

}
