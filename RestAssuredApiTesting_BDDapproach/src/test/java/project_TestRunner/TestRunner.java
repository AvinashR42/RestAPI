package project_TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@tag2",
		features = {"src/test/resources/Feature"},
		glue = {"project_StepDefinitions"},
		dryRun = true,
		publish = true,
		monochrome = true
		)

public class TestRunner {

}
