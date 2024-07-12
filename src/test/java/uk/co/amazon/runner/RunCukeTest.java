package uk.co.amazon.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Nishit Patel
 */
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "uk/co/amazon/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@regression"
)
public class RunCukeTest extends AbstractTestNGCucumberTests {
}