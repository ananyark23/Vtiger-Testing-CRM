package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener
{
	
		javaUtility jutil =new javaUtility();
	    String dateTimeStamp =	jutil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		ExtentReports reports;
		
		@Override
		public void onTestStart(ITestResult result) {
			String methodName=result.getMethod().getMethodName();
			System.out.println(methodName+"-- On test Start executed");
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			String methodName=result.getMethod().getMethodName();
			System.out.println(methodName+"-- On test Success executed");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String methodName=result.getMethod().getMethodName();
			System.out.println(methodName+"-- On test failure executed");
			
			//screenShot of WebPage

		   String screenShotName=methodName+"-"+dateTimeStamp;
			
			SeleniumUtility sutil=new SeleniumUtility();
			try {
				sutil.takeWebpageScreenshot(BaseClass.sdriver, screenShotName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			String methodName=result.getMethod().getMethodName();
			System.out.println(methodName+"-- On test Skipped executed");
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			
		}

		@Override
		public void onStart(ITestContext context) {
			System.out.println("-- On Start executed");
			
			//Configuration of Extent Report
			ExtentSparkReporter reporter =new ExtentSparkReporter("\\Extent_Reports\\report-"+dateTimeStamp+".html");
			reporter.config().setDocumentTitle("Extent Report");
			reporter.config().setReportName("VTiger Report");
			reporter.config().setTheme(Theme.DARK);
			
			//Generate an empty report
			 reports=new ExtentReports();
			reports.attachReporter(reporter);
			reports.setSystemInfo("Base OS", "browser");
			reports.setSystemInfo("Base URl", "http://localhost:8888");
			reports.setSystemInfo("Base Broswers", "Chrome");
			reports.setSystemInfo("Test engineer", "ananya");
		}

		@Override
		public void onFinish(ITestContext context) {
			System.out.println("-- On Finish executed");
			
			//Flushing the report
			reports.flush();
		}
		
		
		

	}
	


