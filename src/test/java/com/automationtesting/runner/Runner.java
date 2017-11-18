package com.automationtesting.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/GoogleSearch.feature",
		glue = "com.automationtesting.glue",
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/GoogleSearch/report.html"},
		format = {"json:target/cucumber.json","html:target/GoogleSearch"}
		)
public class Runner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void setup() {
        Reporter.loadXMLConfig(new File("src/test/resources/extentreports/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 10 Pro");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
