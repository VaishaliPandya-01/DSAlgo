package TestRunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Attachment;


@RunWith(Cucumber.class)


@CucumberOptions(features ={"src/test/resources/features"}, 
glue = {"stepDefinations"}, 
tags= {"@A or @B or @C"},
monochrome = true, 
plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
		"html:target/JUNITHtmlReports/report.html",
		"junit:target/JUNITReports/reports.xml"})

public class TestRunner {
	
	@Attachment
	public String performedActions(Actions actionSequence) {
	    return actionSequence.toString();
	}

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshot(byte[] screenShot) {
	    return screenShot;
	}
	


}
