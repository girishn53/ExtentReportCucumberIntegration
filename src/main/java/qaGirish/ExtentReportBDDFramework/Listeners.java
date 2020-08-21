package qaGirish.ExtentReportBDDFramework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.Feature;


public class Listeners extends ExtentReportListener implements ITestListener {

	private static ExtentReports extent;

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
		// test.log(Status.PASS,"Successful");

	}

	public void onTestFailure(ITestResult result) {
		// test.fail(result.getThrowable());

	}

	public void onStart(ITestContext context) {
		extent = setUp();

	}

	public void onFinish(ITestContext context) {
		extent.flush();

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

}
