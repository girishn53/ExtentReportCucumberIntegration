package runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

public class CustomRunner {
	
	

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)

	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs cucumber feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {

		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider(parallel=true)
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		testNGCucumberRunner.finish();
	}

}

