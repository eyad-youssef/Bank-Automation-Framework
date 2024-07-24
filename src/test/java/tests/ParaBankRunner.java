package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/tests" ,
        glue =    {"test/tests/StepDefinitions"},
        tags = "@smoke"

)

public class ParaBankRunner extends AbstractTestNGCucumberTests {

}