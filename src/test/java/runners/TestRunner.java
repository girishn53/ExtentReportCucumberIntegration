package runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;

//Test Comment new
@Test
@CucumberOptions(features = "src/test/resources/FeatureFiles",

		tags = "@testing1",

		glue = { "stepdefinitions" }

	

)

public class TestRunner extends CustomRunner {

}