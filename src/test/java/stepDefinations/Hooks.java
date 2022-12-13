package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseClass.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends TestBase{
	
	
	@Before
    public static void setUp() {
     
     TestBase.Initialization();
    }
 
    @After
    public static void tearDown() {
 
    	
    	TestBase.teardown();
    }
    
    @AfterStep
    public static void ScreenShot(Scenario scenario) {
 
    	 if(scenario.isFailed()) {
             final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.attach(screenshot, "image/png", scenario.getName()); 
    }
    }
    

}
