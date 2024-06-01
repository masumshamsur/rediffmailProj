package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"test/java/feature"},
        glue = {"test/java/steps/HomeStepDefinition.java"}
)
public class TestRunner {
}
*/


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/home.feature", // Specify the path to your feature files
        glue = {"stepDefinitions"}, // Specify the package where your step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports"} // Specify the reporting format and location
)
public class TestRunner {
}
