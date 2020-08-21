package stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import qaGirish.ExtentReportBDDFramework.ExtentReportListener;

public class Steps extends ExtentReportListener {

	public WebDriver driver=null;

	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {

		ExtentTest logInfo=null;
		try {
			test = extent.createTest(Feature.class, "TestNew");							
			test=test.createNode(Scenario.class, "User launches facebook application");						
			logInfo=test.createNode(new GherkinKeyword("Given"), "user_is_on_homepage");
					
		
			
			
			//logInfo.addScreenCaptureFromPath(captureScreenShot(driver));			
			
		} catch (AssertionError | Exception e) {
			testStepHandle("FAIL",driver,logInfo,e);			
		}
		
		System.setProperty("webdriver.chrome.driver", "F://browserdrivers//chromedriver_win32 (5)//chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		logInfo.pass("Opened chrome browser and entered url");
		
		driver.close();
	}

	
	
	@Then("^User is on homepage of facebook and verifies title$")
	public void user_is_on_homepage_of_facebook_and_verifies_title() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F://browserdrivers//chromedriver_win32 (5)//chromedriver.exe");

		
		
		
		ExtentTest logInfo=null;
		try {
			test = extent.createTest(Feature.class, "Title");							
			test=test.createNode(Scenario.class, "User is on homepage of facebook and verifies title");						
			logInfo=test.createNode(new GherkinKeyword("Then"), "User is on homepage of facebook and verifies title");
					
			System.setProperty("webdriver.chrome.driver", "F://browserdrivers//chromedriver_win32 (5)//chromedriver.exe");

			driver = new ChromeDriver();

			driver.get("https://www.facebook.com/");
			
			String expectedTitle="Faceboo";
					
			String Actualtitle=driver.getTitle();
			
			Assert.assertEquals(Actualtitle, expectedTitle);
			
			logInfo.pass("Title is matching");
			
					
			
		} catch (AssertionError | Exception e) {
			
			
			testStepHandle("FAIL",driver,logInfo,e);	
			
			
		}
		
		
		
		
	}


}
