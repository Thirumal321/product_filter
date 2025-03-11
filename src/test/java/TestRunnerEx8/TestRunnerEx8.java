package TestRunnerEx8;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/resources/features/productfilter.feature",
    glue = "stepDefinitions",
  //  plugin = {"pretty", "html:target/cucumber-reports"}
     plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"})
public class TestRunnerEx8 extends AbstractTestNGCucumberTests {

}
