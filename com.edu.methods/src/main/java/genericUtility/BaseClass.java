package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass 
{
		 public ExcelUtility eutil = new ExcelUtility();
        public  PropertiesUtility putil = new PropertiesUtility();
		 public SeleniumUtility sutil = new SeleniumUtility();
		public  WebDriver driver;
		public static WebDriver sdriver;
	
		@BeforeSuite(alwaysRun = true)
		public void bsConfig()
		{
			System.out.println("DB connected");		
		}
		@BeforeClass(alwaysRun = true)
		public void bcConfig() throws IOException
		{
			driver = new ChromeDriver();
			sutil.maximizeWindow(driver);
			sutil.implicitWait(driver, 5);
			String Url = putil.getDataFromProperties("url");
			sutil.accessApplication(driver, Url);
			System.out.println(" browser launched ");
			sdriver = driver;
		}
		@BeforeMethod(alwaysRun = true)
		public void bmCongif() throws IOException
		{
			String UN = putil.getDataFromProperties("username");
			String PWD = putil.getDataFromProperties("password");
			LoginPage login = new LoginPage(driver);
			login.loginToApplications(UN, PWD);
			System.out.println(" loggeed in ");
		}
		
		@AfterMethod(alwaysRun = true)
		public void amConfig()
		{
			HomePage hp = new HomePage(driver);
			hp.logoutOperation(driver);
			System.out.println("logged out");
			
		}
		@AfterClass(alwaysRun = true)
		public void acConfig()
		{
			sutil.closeBrowser(driver);
			System.out.println(" browser closed");
		}
		
		@AfterSuite(alwaysRun = true)
		public void asConfig()
		{
			System.out.println(" DB connection closed");
		}
	
		
}
