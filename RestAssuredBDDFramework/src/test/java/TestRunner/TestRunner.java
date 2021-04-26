package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\jijin\\eclipse-workspace\\RestAssuredBDDFramework\\src\\test\\java\\features\\GetPost.feature",
glue= {"steps"},
format= {"pretty","html:test-output"}, // to generate the different types of report => html,JSON & xml formats
strict=true,  // it will check if any step is not defined in Step Def file
dryRun=false, // to check the mapping between feature file and StepDef file
monochrome=true // display the console output more readable format
)
public class TestRunner {

}
