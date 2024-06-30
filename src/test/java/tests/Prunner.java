package tests;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//@CucumberOptions(
//        features = {},
//        glue = {},
//        plugin = {},
//        tags = "@Pb"
//
//
//
//)
//public class Prunner extends AbstractTestNGCucumberTests {
//}


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/newAccounts" ,
        glue =    {"test/tests/StepDefinitions"},


        tags = "@smoke"

)

public class Prunner extends AbstractTestNGCucumberTests {

}