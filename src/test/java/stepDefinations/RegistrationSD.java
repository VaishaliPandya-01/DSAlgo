package stepDefinations;

import org.testng.asserts.SoftAssert;

import baseClass.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GetStartedPage;
import pages.HomePage;
import pages.RegistraionPage;

public class RegistrationSD extends TestBase{
	
	GetStartedPage getStarted;
	HomePage homePage;
	RegistraionPage registration;
	
	
	
	@Given("user is on landing page")
	public void user_is_on_landing_page() {
		Initialization();
	}

	
	@When("user clicks on get Started button")
	public void user_clicks_on_get_started_button() {
		getStarted = new GetStartedPage();
		
		getStarted.validateLandingPage();
		getStarted.getStartedBtn();
	}

	
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		homePage = new HomePage();
		
		try {
			homePage.validateHomePage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@And("user clicks on registration link")
	public void user_clicks_on_registration_link() {
		homePage.registerHomeBtn();
	}


	@Then("user should be landed on registration page")
	public void user_should_be_landed_on_registration_page() {
		registration = new RegistraionPage();
		registration.validateRegistrationPage();
	}

	
	@And("^user  enters  (.*) (.*) and (.*)$")
	public void user_enters_username_password_and_passwordConfm(String username,String password,String passwordConfm) {
		
		registration.userNameTxt(username);
		registration.passwordTxt(password);
		registration.passwordConfmTxt(passwordConfm);
	}

	
	@And("click on register button")
	public void click_on_register_button() {
		registration.registrationBtn();
	}

	
	@Then("if registration is sucessful user should be redirected to homepage or error message should be display")
	public void if_registration_is_sucessful_user_should_be_redirected_to_homepage_or_error_message_should_be_display() {
//		try {
//			homePage.validateHomePage();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String msg = registration.RegistrationValidationMsg();
		SoftAssert SA = new SoftAssert();
		boolean actualErrorMessage= false;
		
		if(msg.contains("You are logged in")) {
			
			actualErrorMessage =true;
		SA.assertTrue(actualErrorMessage);
		System.out.println(msg);
		SA.assertAll();
		}
		
		else {
			
			actualErrorMessage =false;
			SA.assertTrue(actualErrorMessage);
			System.out.println(msg);
			SA.assertAll();
		}
		driver.close();		
	}
}
