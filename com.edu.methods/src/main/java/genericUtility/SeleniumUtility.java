package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility 
{
	public void accessApplication(WebDriver driver, String Url) 
	{
		driver.get(Url);
	}
	public void maximizeWindow(WebDriver driver) 
	{
		driver.manage().window().maximize();
		
	}
	public void implicitWait(WebDriver driver, int maxTime) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
		
	}
	public void closeBrowser(WebDriver driver) 
	{
		driver.quit();
	}
	public void selectOptionByValue(WebElement dropdownElement, String value)
	{
		Select s =new Select(dropdownElement);
		s.selectByValue(value);
	}
	public void selectOptionByIndex(WebElement dropdownElement, int index)
	{
		Select s =new Select(dropdownElement);
		s.selectByIndex(index);
	}
	public void mouseHovering(WebDriver driver,WebElement element)
	{
		new Actions(driver).moveToElement(element).perform();
	}
	
	public void rightClick(WebDriver driver, WebElement element) 
	{
		 new Actions(driver).contextClick(element).perform();
	}
			
	public void scrollWebpage(WebDriver driver, WebElement element)
	{
		new Actions(driver).scrollToElement(element).perform();
	}
	
	public void acceptAlert(WebDriver driver) 
	{
		 driver.switchTo().alert().accept();
	}
			
	public void cancelAlert(WebDriver driver) 
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void switchToFrameUsingIndex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);

	}
	public void switchToFrameUsingNameOrId(WebDriver driver, String nameOrId)
	{
		driver.switchTo().frame(nameOrId);

	}
	public void switchToAnotherTabWhenTwoTabs(WebDriver driver) 
	{
			String pid = driver.getWindowHandle();
			Set<String> allIds = driver.getWindowHandles();
			for (String id:allIds)
			{
				if(!id.equals(pid)) 
				{
					driver.switchTo().window(id);
				}
			}
	}
	public void uploadFile(WebElement fileUploadEle, String filePath)
	{
		fileUploadEle.sendKeys(filePath);
	}
	
	public String takeWebpageScreenshot(WebDriver driver,String fileName) throws IOException 
	{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(".\\Screenshot\\"+fileName+".png");
			Files.copy(src, dest);
			return dest.getAbsolutePath();
	}

	
	
}
