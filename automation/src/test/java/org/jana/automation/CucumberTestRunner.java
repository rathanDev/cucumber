package org.jana.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


// Error
//@CucumberOptions(
//        features = "classpath:features",
//        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"}
//)

@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "classpath:features/",
//        glue = "org.jana.automation.steps", // Package containing your step definitions
//        plugin = {"pretty", "json:target/cucumber.json"}
//)
public class CucumberTestRunner {
}
